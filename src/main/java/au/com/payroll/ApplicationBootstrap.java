package au.com.payroll;

import au.com.payroll.config.BootstrapData;
import au.com.payroll.ui.ConsoleImpl;

/**
 * Entry point to start the application
 *
 * @author rnadeera
 */
public class ApplicationBootstrap {
    public static void main(String[] args){
        initBootstrap();

        new ConsoleImpl().start();
        System.exit(0);
    }

    /**
     * Contains any bootstrap related method call
     *
     */
    private static void initBootstrap(){
        new BootstrapData().initData();
    }
}
