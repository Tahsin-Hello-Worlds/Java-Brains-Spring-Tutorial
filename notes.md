o conclude, beanPostProcessor is some common code to execute for all type of beans after initialization, while init-methods are only for individual beans.
What confuses me is the name, even though it's called postProcessBeforeInitialization, actually the bean object passed into this method is already initialized and properties set. "BeforeInitialization" here only means before other init logic like init-methods.
The order is as below FYI
1. postProcessBeforeInitialization (Note that here, the bean object itself is already initialized and properties set)
2. InitializingBean
3. init method
4. postProcessAfterInitialization