# Smart Contract Design Pattern

The implementation of the pattern has been done in Java language version 17.0.1 in the IntelliJ IDEA.

## Source code

The Java source code of the pattern implementation has been placed in ``src/pl/gdynia/amw/scdp`` package.

Navigate to: [SCDP source code](https://github.com/drGorski/SmartContractDesignPattern/tree/master/src/pl/gdynia/amw/scdp)

## Tests

Whereas, tests for the implementation have been placed in ``tests/pl/gdynia/amw/scdp`` package.

Navigate to: [SCDP tests](https://github.com/drGorski/SmartContractDesignPattern/tree/master/tests/pl/gdynia/amw/scdp)

## The pattern description

The following pattern layers have been identified: ``Abstract`` and ``Concrete``. The ``Abstract`` layer consists of the ``SmartContract`` abstract class and the ``VerificationRule`` interface. Whereas, the ``Concrete`` layer uses classes implementation-specific for concrete smart contract. Diverse object-oriented paradigms and constructs have been employed in the definition of the pattern. Inheritance allows for providing the common abstract type for smart contracts. Moreover, the interface enforces the implementation of the same validation method.

The abstract class ``SmartContract`` declares the list of rules and uses the definition of the ``VerificationRule`` interface. The interface defines ``runRule()`` method that must be implemented by concrete verification rule class. Both elements fulfill certain roles in the pattern and they are marked with appropriate stereotypes, ``<<AbstractSContract>>`` for ``SmartContract`` class and ``AbstractVRule`` for ``VerificationRule`` interface. The specific ``ExchangeEnergyContract`` class actually implements ``checkSC()`` method that iterates over the list of actual verification rules. 

Likewise here, both elements have a specific role in the pattern and they are marked with appropriate stereotypes, $\ll$SContract$\gg$ for \textit{ExchangeEnergyContract} and $\ll$VRule$\gg$ for all pecific verification rules, e.g. \textit{TechnicalVR1}, \textit{BusinessVR1}. The design of the pattern puts emphasis on the order of storing verification rules in a dynamic list. The full list of rules is evaluated unless one of them is not met. Then the verification is aborted and the transaction is not executed. Such a design manner shortens the smart contract validation time.

