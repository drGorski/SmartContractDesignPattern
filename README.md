# Smart Contract Design Pattern

The implementation of the pattern has been done in Java language version 17.0.1 in the IntelliJ IDEA.

## Source code

The Java source code of the pattern implementation has been placed in ``src/pl/gdynia/amw/scdp`` package.

Navigate to: [SCDP source code](https://github.com/drGorski/SmartContractDesignPattern/tree/master/src/pl/gdynia/amw/scdp)

## Tests

Whereas, tests for the implementation have been placed in ``tests/pl/gdynia/amw/scdp`` package.

Navigate to: [SCDP tests](https://github.com/drGorski/SmartContractDesignPattern/tree/master/tests/pl/gdynia/amw/scdp)

## The pattern description

The pattern uses abstract smart contract class and interface for abstract verification rule. Thefollowing pattern layers have been identified: ``Abstract`` and ``Concrete``. The ``Abstract`` layer consists of the ``SmartContract`` abstract class and the ``VerificationRule`` interface. Whereas, the ``Concrete`` layer uses classes implementation-specific for concrete smart contract. Diverse object-oriented paradigms and constructs have been employed in the definition of the pattern. Inheritance allows for providing the common abstract type for smart contracts. Moreover, the interface enforces the implementation of the same validation method.

