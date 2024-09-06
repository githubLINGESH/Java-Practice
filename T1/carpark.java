import java.util.*;

class modules{
    int[][] a = new int[10][10];
    HashMap<String,Integer> h = new HashMap<>();
    Scanner s = new Scanner(System.in);
    public void Initialize(){
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                a[i][j] = 0;
            }
        }
    }

    public void display(){
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(a[i][j]==0){
                    System.out.print('-');
                }
                else{
                    System.out.print(a[i][j]);
                }
            }
            System.out.println();
        }
    }

    public void insert(){
        String Nu;
        
        System.out.println("Time of Entry:");
        int Time = s.nextInt();
        System.out.println("Vehicle Type:");
        int type = s.nextInt();
        System.out.println("Vehicle No:");
        Nu = s.nextLine();


        int car = 1;
        int bike = 2;
        int cycle = 3;
        if(type==car){
            for(int i=0;i<10;i++){
                for(int j=0;j<4;j++){
                    if(a[i][j]==0){
                        a[i][j]=1;
                    }
                break;
                }
            break;
            }
            h.put(Nu,Time);
        }
        else if(type==bike){
            for(int i=0;i<10;i++){
                for(int j=4;j<8;j++){
                    if(a[i][j]==0){
                        a[i][j]=2;
                    }
                break;
                }
            break;
            }
            h.put(Nu,Time);
        }
        else{
            for(int i=0;i<10;i++){
                for(int j=8;j<10;j++){
                    if(a[i][j]==0){
                        a[i][j]=3;
                    }
                break;
                }
            break;
            }
            h.put(Nu,Time);
        }
    }

    public void history(){
        Set<Integer> values = new HashSet<>();
        for (Integer value : h.values()) {
            values.add(value);
        }

        Set<String> keys = new HashSet<>();
        for (String key : h.keySet()) {
            keys.add(key);
        }

        System.out.println(keys);
        System.out.println(values);
        
    }
}

public class carpark{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        modules m = new modules();

        int ch = 0;

        while(ch!=6){
            System.out.println("Enter the choice:");
            ch = s.nextInt();
            switch(ch){
                case 1:
                    m.Initialize();
                    break;
                case 2:
                    m.display();
                    break;
                case 3:
                    m.insert();
                    break;
                case 5:
                    m.history();
            }
        }
    }
}