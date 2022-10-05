# SOLID Principles

S - Single Responsibility Principle
    A software entity should have one reason to change
    
    Medium https://medium.com/@gabriele.porcelli/single-responsibility-principle-for-developers-uxers-testers-50f0e704d07f
    Gist https://gist.github.com/xpepper/4981a717dd2a4f78e895
    
O - Open Close principle
    Software entities like classes, modules and functions should be open for extension but closed for modifications.
    
    
L - Liskov Substitution Principle (Behavioural subtyping)
    Let Φ(x) be a property provable about objects x of type T. Then Φ(y) should be true for objects y of type S where S is a subtype of T.
    A sub type should behave like a super type as far as you can tell by using the super type methods.
    (So it's not that the sub type cannot behave differently, but as long as you limit your interactions to the super type methods, it should behave as expected)
    
    https://www.youtube.com/watch?v=-Z-17h3jG0A&ab_channel=TuringAwardeeClips
    
I - Interface Segregation Principle
    A client should never be forced to implement an interface that it doesn’t use, or clients shouldn’t be forced to depend on methods they do not use.
    
    
D - Dependency Inversion Principle
    Entities must depend on abstractions, not on concretions. It states that the high-level module must not depend on the low-level module, but they should depend on abstractions.

