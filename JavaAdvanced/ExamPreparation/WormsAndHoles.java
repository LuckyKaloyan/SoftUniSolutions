package AdvancedModule.ExamPreparation;


import java.util.*;

public class WormsAndHoles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[]worms= Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[]holes = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> wormsStack = new ArrayDeque<>();
        ArrayDeque<Integer> holesQueue = new ArrayDeque<>();


        for (int worm : worms) {
            wormsStack.push(worm);

        }
        for (int hole : holes) {
            holesQueue.add(hole);
        }
        int matches = 0;

        while(!wormsStack.isEmpty() && !holesQueue.isEmpty()){
            int wormValue = 0;
            int holeValue = 0;
            if(wormsStack.peek()!=null){
                wormValue = wormsStack.peek();
            }
            if(holesQueue.peek()!=null){
                holeValue = holesQueue.peek();
            }



            if(wormValue==holeValue){
                matches++;
                wormsStack.pop();
                holesQueue.poll();
            }else{
                holesQueue.poll();
                if(wormValue<=3){
                    wormsStack.poll();
                }else{
                    wormsStack.pop();
                    if(wormValue-3>3) {
                        wormsStack.push(wormValue - 3);
                    }
                }
            }


            if(wormsStack.isEmpty() || holesQueue.isEmpty()){break;}
        }

        if(matches>0){
            System.out.println("Matches: "+matches);
        }else{
            System.out.println("There are no matches.");
        }
        ArrayList<Integer> wormlist = new ArrayList<>();
        for(int worm:worms){
            if(!wormsStack.isEmpty()){
                if(wormsStack.peek()!=null){wormlist.add(wormsStack.peek());}
                wormsStack.pop();
            }

        }
        Collections.reverse(wormlist);
        if(wormlist.isEmpty()){
            System.out.print("Every worm found a suitable hole!");
        }else{
            System.out.print("Worms left: ");
            for(int i=0; i<wormlist.size(); i++){
                if(i!=wormlist.size()-1){
                    System.out.print(wormlist.get(i)+", ");
                }else{
                    System.out.print(wormlist.get(i));
                }
            }
        }
        System.out.println();
        if(holesQueue.isEmpty()){
            System.out.print("Holes left: none");
        }
        else{

            System.out.print("Holes left: ");
            for(int hole:holes){
                if(holesQueue.peek()!=null){
                    System.out.print(holesQueue.poll());
                    if(!holesQueue.isEmpty()){
                        System.out.print(", ");
                    }
                }

            }
        }
    }
}
