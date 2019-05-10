package at.ac.wu.nm.ansible;

import at.ac.wu.nm.ansible.syntax.strategy.Expect;

import at.ac.wu.nm.ansible.syntax.chain.*;

import at.ac.wu.nm.ansible.syntax.chain.unified.MyPlaybookBuilder;
import at.ac.wu.nm.expr.TestExprBuilder;;

public class App 
{
  
  public static void main( String[] args )
  {
    at.ac.wu.nm.ansible.syntax.single.
    /*// pbuilder1 //*/
    PlaybookBuilder
    .Playbook(/*... */)
      .play(/*... */)
        .task(/*... */)
        .task(/*... */)
      .play(/*... */)
        .task(/*... */)
    /*// end //*/
    .get();

    at.ac.wu.nm.ansible.syntax.multiple.
    PlaybookBuilder
    .Playbook(/*... */)
    .play(/*... */)
      .task(/*... */)
      .task(/*... */)
    .play(/*... */)
      .task(/*... */)
    .get();

    at.ac.wu.nm.ansible.syntax.strategy.
    /*// pbuilder2 //*/
    PlaybookBuilder
    .Playbook(/*... */)
      .play(/*... */)
        .task("run some command")
          .shell("/usr/bin/some")
        .task("run another command")
          .shell("/usr/bin/another", Expect.Shell())
          .response("OK")
            .body("send_user done")
          .response("NOTOK")
            .body("send_user failed; abort")  
    /*... */
    /*// end //*/
    .get();

    at.ac.wu.nm.ansible.syntax.chain.base.
    /*// chain1 //*/      
    MyPlaybookBuilder.Playbook()
    .play()
      .task("run some command")
      .task("run another command");
    /*// end //*/

    at.ac.wu.nm.ansible.syntax.chain.conditional.
    /*// chain2 //*/
    MyPlaybookBuilder.Playbook()
    .play()
      .task("run some command")
        .when("statusCode is failed")
      .task("run another command")
        .when("statusCode is succeeded");
    /*// end //*/

    at.ac.wu.nm.ansible.syntax.chain.restricted.
    /*// chain3 //*/
    MyPlaybookBuilder.Playbook()
    .play()
      .task("run some command")
        .when("statusCode is failed")
      .task("run another command")
        .when("statusCode is succeeded");
    /*// end //*/

    at.ac.wu.nm.ansible.syntax.chain.extcomp.
    /*// chain4 //*/
    MyPlaybookBuilder.Playbook()
    .play()
      .taskWhen("run some command", 
                "statusCode is failed")
      .taskWhen("run another command", 
                "statusCode is succeeded");
    /*// end //*/
    
    
    at.ac.wu.nm.expr.
    /*// expr1 //*/
    TestExprBuilder.Test()
     .variable("varName").eq("foo")
    /*// end //*/
     .get()
     .evaluate(
         TestExprBuilder.SimpleContext().
           put("statusCode","none").
           put("executionTime","1000").
           get()
     );
    
    at.ac.wu.nm.ansible.syntax.chain.unified.
    /*// expr2 //*/
    MyPlaybookBuilder.Playbook()
    .play()
      .task("run some command")
        .when(MyPlaybookBuilder.Test()
            .variable("statusCode")
            .eq("failed"))
      .task("run another command")
        .when(MyPlaybookBuilder.Test()
            .variable("statusCode")
            .eq("succeeded"));
    /*// end //*/


    /* ICorePlaybookBuilder builder = new PlaybookBuilder();  
    	ICorePlaybookBuilder builderProxy = ChainingHandler.simpleProxy(builder, 
    	    ICorePlaybookBuilder.class);
    	builderProxy.play();


    	((ICorePlaybookBuilder & IConditionalPlaybookBuilder)((ICorePlaybookBuilder & IConditionalPlaybookBuilder)ChainingHandler.simpleProxy(builder, 
          ICorePlaybookBuilder.class, IConditionalPlaybookBuilder.class)).when()).play().task();
    }*/
  }
}