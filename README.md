# Spring_AOP
Spring Aspect Oriented Programming (AOP) provides the capability to implement various cross-cutting concerns of the application 
Such concerns are logging, transaction handling, performance monitoring, security etc. These concerns are known as cross cutting concerns of the application.

![image](https://github.com/dhirajapp/Spring_AOP/assets/47515998/83603fa2-d09f-4ba5-92d5-5eae45d5bec4)


AOP help is implementing the cross cutting concerns of the application keeping them separate from the main business logic and thus resulting in loosely coupled applications.


## AOP terminologies
- Aspect
- Advice
- Join Point
- Point Cut
- Target
- Proxy
- Weaving
- Introduction
## Advices
- Before Advice
- After (returns) Advice
- After (throws) Advice
- After (finally)Advice
- Around Advice
## PointCuts and PointCutAdvisors
- NameMatchMethodPointcut
- NameMatchMethodPointcutAdvisor
- RegexpMethodPointcutAdvisor
## Proxy Objects

### There are two ways to use Spring AOP AspectJ implementation:

- By annotation: 
- By xml configuration (schema based)


### Spring AspectJ AOP implementation provides many annotations:

- @Aspect declares the class as aspect.
- @Pointcut declares the pointcut expression.
The annotations used to create advices are given below:

- @Before declares the before advice. It is applied before calling the actual method.
- @After declares the after advice. It is applied after calling the actual method and before returning result.
- @AfterReturning declares the after returning advice. It is applied after calling the actual method and before returning result. But you can get the result value in the advice.
- @Around declares the around advice. It is applied before and after calling the actual method.
- @AfterThrowing declares the throws advice. It is applied if actual method throws exception.


