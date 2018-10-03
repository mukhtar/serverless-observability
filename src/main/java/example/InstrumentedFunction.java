package example;

import com.iopipe.IOpipeExecution;
import com.iopipe.SimpleRequestHandlerWrapper;

public class InstrumentedFunction extends SimpleRequestHandlerWrapper<String, String> {

  protected String wrappedHandleRequest(IOpipeExecution execution, String input) {
    System.out.println("called");
    return Greeter.greet(input);
  }

}