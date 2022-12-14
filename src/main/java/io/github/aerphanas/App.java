package io.github.aerphanas;

import java.util.function.Consumer;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // String -> Void
        Consumer<String> printStrLn = (x) -> System.out.println(x);
        printStrLn.accept("hello world");
    }
}
