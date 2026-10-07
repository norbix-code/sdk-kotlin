package ai.norbix.sdk.core

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNull
import kotlin.test.assertTrue

/** The typed view of a `{ id, display }` pair an `expandReferences` read returns. */
class ExpandedReferenceTest {

    @Test
    fun aPairIsReadWithItsIdAndDisplay() {
        val ref = ExpandedReference.from(mapOf("id" to "usr_1", "display" to "Jane Doe"))
        assertEquals(ExpandedReference(id = "usr_1", display = "Jane Doe"), ref)
        assertTrue(ref!!.isResolved)
        assertEquals("Jane Doe", ref.displayText())
    }

    @Test
    fun aMissingTargetIsAnUnresolvedPair() {
        val ref = ExpandedReference.from(mapOf("id" to "usr_gone", "display" to null))!!
        assertEquals("usr_gone", ref.id)
        assertFalse(ref.isResolved)
        assertNull(ref.displayText())
    }

    @Test
    fun aLanguageMapDisplayPicksTheAskedLanguageOrTheFirst() {
        val ref = ExpandedReference.from(mapOf("id" to "trm_1", "display" to mapOf("en" to "News", "lt" to "Naujienos")))!!
        assertEquals("Naujienos", ref.displayText("lt"))
        assertEquals("News", ref.displayText("fr"))
        assertEquals("News", ref.displayText())
    }

    @Test
    fun aBareIdFromAReadWithoutTheFlagIsKeptAsAnUnresolvedId() {
        val ref = ExpandedReference.from("usr_1")!!
        assertEquals("usr_1", ref.id)
        assertFalse(ref.isResolved)
        assertNull(ExpandedReference.from(null))
        assertNull(ExpandedReference.from(42))
    }

    @Test
    fun aMultipleReferenceIsAListOfPairs() {
        val refs = ExpandedReference.listFrom(
            listOf(mapOf("id" to "6650", "display" to mapOf("en" to "News")), mapOf("id" to "6651", "display" to null)),
        )
        assertEquals(listOf("6650", "6651"), refs.map { it.id })
        assertEquals(listOf(true, false), refs.map { it.isResolved })
        assertEquals(emptyList(), ExpandedReference.listFrom(null))
        assertEquals(1, ExpandedReference.listFrom(mapOf("id" to "x", "display" to "y")).size)
    }
}
