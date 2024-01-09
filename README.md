## Basics of AOP in the Project

This project demonstrates a simple implementation of Aspect-Oriented Programming (AOP) with Spring, focusing on 'before' and 'after' advices.

- **Aspect (`BeforeAfterAopAspect`):** Modularized cross-cutting concerns (e.g., logging) across multiple classes.
- **Pointcut:** Defined with expressions like `execution(* com.dotin.aspect.business.*.*(..))`, it determines the join points (specific method executions in this case) where the advice is applied.
- **Advice (`before`, `after`):** Actions taken at a join point, either before or after the method execution.
- **Join Point:** Specific points in the program execution, such as method calls in `AspectApplicationTests`, where aspects are applied.
- **Weaver:** Part of the AOP framework that links aspects with other application types, creating advised objects during runtime in Spring AOP.
