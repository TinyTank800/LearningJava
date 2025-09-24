# Day 5 – Threads & Concurrency

### Q1:
> What’s the difference between a thread and a process?
> ### Example:
> Write a simple `Runnable` that prints the current thread’s name. Start two threads running the same task.
> ### Requirement:
> - You can create a thread with `Thread` or `Runnable`.
> - You know how a thread differs from a process.
> - You can run multiple threads in parallel.

### Q2:
> How do you synchronize access to shared data?
> ### Example:
> Create a shared counter. Increment it from two threads without synchronization (observe race conditions). Then fix it with `synchronized`.
> ### Requirement:
> - You can demonstrate a race condition.
> - You can use `synchronized` to prevent race conditions.
> - You understand the cost of synchronization (performance trade-off).

### Q3:
> What’s the role of `ExecutorService` in Java?
> ### Example:
> Use `Executors.newFixedThreadPool(2)` to run 5 tasks that each sleep for 1 second. Observe thread reuse.
> ### Requirement:
> - You can create an `ExecutorService`.
> - You can submit tasks with `execute` or `submit`.
> - You can shut down an executor properly.

### Q4:
> What are common concurrency utilities in `java.util.concurrent`?
> ### Example:
> Use a `ConcurrentHashMap` to safely store key/value pairs across multiple threads.
> ### Requirement:
> - You can use a thread-safe collection like `ConcurrentHashMap`.
> - You understand the difference between regular and concurrent collections.
> - You can explain when to choose `CopyOnWriteArrayList`, `BlockingQueue`, or locks.

### Mini-Project:
> Build a **multi-threaded combat simulator**:
> - Each `Warrior` runs on its own thread, repeatedly attacking a shared opponent.
> - Synchronize updates to health so no thread overwrites another.
> - Log each attack with the thread’s name.
> ### Requirement:
> - You can coordinate multiple threads in a simulation.
> - You can use synchronization or concurrent collections to prevent race conditions.
> - You can demonstrate safe multi-threaded program behavior.

### Notes
> - A process is a program that runs with memory and resources while a thread is a worker doing somthing to complete the process.
> - A process can contain many threads doing different things.
> - A race condition is when you are trying to edit a value from multiple threads and depending on completion order will give different or unexpected results.
> - Using Synchronized will lock a value while one thread is using it so other threads will wait until its done being used/changed.
> - Syncronization will slow down the program if you multi thread while using one data point.
> - ExecutorService is a high level way to manage threads and thread pools.
> - You can use ExecutorService to create a pool of threads to run tasks or await completions and remove it.
> - Making an exector will run that task on all threads from the pool.
> - Make sure to shutdown the executor when done.
> - A concurrent hashmap will allow mutliple threads to access their own data but require threads to wait if they request the same data.
> - Copy on write will copy the whole list when a change is made so other threads can still access the old version.
> - Blocking queue will allow threads to wait for data to be added or removed from the queue.
> - Locks are a lower level way to manage access to data and can be more efficient than synchronized in some cases.
> - Got most of the project done but some issues related to concurrency and thread safety. Still learning so will clean up tomorrow.