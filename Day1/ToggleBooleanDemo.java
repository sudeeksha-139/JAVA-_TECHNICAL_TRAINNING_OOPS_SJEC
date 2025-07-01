class ToggleBoolean{
    static boolean toggleUsingNot(boolean flag){
    return !flag;
}
    static boolean toggleUsingXor(boolean flag){
     return flag ^ true;
    }
   static boolean toggleUsingTernary(boolean flag) {
        return flag ? false : true;
    }

    static boolean toggleUsingIfElse(boolean flag) {
        if (flag) {
            return false;
        } else {
            return true;
        }
    }

    static boolean toggleUsingSwitch(boolean flag) {
        switch (Boolean.toString(flag)) {
            case "true":
                return false;
            case "false":
                return true;
            default:
                return flag; // default case (should not occur)
        }
    }
}

public class ToggleBooleanDemo{
    public static  void main(String[]args){
       boolean  flag=true;
      System.out.println(ToggleBoolean.toggleUsingNot(flag));
      System.out.println(ToggleBoolean.toggleUsingXor(flag));
      System.out.println(ToggleBoolean.toggleUsingTernary(flag));
      System.out.println(ToggleBoolean.toggleUsingIfElse(flag));
      System.out.println(ToggleBoolean.toggleUsingSwitch(flag));
    }
}


