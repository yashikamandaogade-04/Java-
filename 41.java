class Restaurant {
    boolean foodReady=false;

    synchronized void prepareFood(){
        System.out.println("Chef prepared food");
        foodReady=true;
        notify();
    }

    synchronized void serveFood(){
        while(!foodReady){
            try{wait();}catch(Exception e){}
