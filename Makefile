PYTHON := python3

.PHONY: help test build check

help:
	@echo "make test               - run gradle tests"
	@echo "make build              - run gradle build"
	@echo "make check              - test + build"

test:
	gradle test

build:
	gradle build

check: test build
