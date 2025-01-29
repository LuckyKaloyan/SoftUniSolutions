
public class TrafficLights {

        String[] input;
        int times;

  TrafficLights(String[]input, int times){
      this.input = input;
      this.times = times;
  }

        public void print(){
            for(int i=0; i<times; i++){
                for(int j=0; j<input.length; j++){
                    if(input[j].equals("GREEN")){
                        input[j]="YELLOW";
                    }else if(input[j].equals("RED")){
                        input[j]="GREEN";
                    }else {input[j]="RED";}
                    System.out.print(input[j]+" ");

                }
                System.out.println();
            }

        }


    }

