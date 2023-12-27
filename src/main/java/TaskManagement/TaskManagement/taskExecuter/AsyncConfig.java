package TaskManagement.TaskManagement.taskExecuter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@EnableAsync
public class AsyncConfig {

    @Bean(name = "customTaskExecutor")
    public ThreadPoolTaskExecutor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(5); // Set the core pool size
        executor.setMaxPoolSize(10); // Set the maximum pool size
        executor.setQueueCapacity(25); // Set the queue capacity
        executor.setThreadNamePrefix("CustomTaskExecutor-");
        executor.initialize();
        return executor;
    }
}