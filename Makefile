PYTHON := python3

.PHONY: help sync-types sync-types-update generate test build check

help:
	@echo "make sync-types         - generate Kotlin ServiceStack references with x tool"
	@echo "make sync-types-update  - update existing *.dtos.kt references"
	@echo "make generate           - generate sdk modules/tests/docs"
	@echo "make test               - run gradle tests"
	@echo "make build              - run gradle build"
	@echo "make check              - generate + test + build"

sync-types:
	$(PYTHON) scripts/sync_types.py

sync-types-update:
	$(PYTHON) scripts/sync_types.py --update-only

generate:
	$(PYTHON) scripts/generate_endpoints.py

test:
	gradle test

build:
	gradle build

check: generate test build
