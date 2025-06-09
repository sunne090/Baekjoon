import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String room = scanner.nextLine();
        int max = 0;

        int[] roomNums = new int[10];

        for(int i = 0; i < room.length(); i++){
            roomNums[room.charAt(i) - '0']++;
        }
        int sumSixAndNine =  roomNums[6] + roomNums[9];

        if(sumSixAndNine % 2 == 0){
            roomNums[6] = (sumSixAndNine)/2;
            roomNums[9] = (sumSixAndNine)/2;
        } else {
            roomNums[6] = (sumSixAndNine+1)/ 2;
            roomNums[9] = (sumSixAndNine+1)/ 2;
        }

        for(int i = 0; i < roomNums.length; i++){
            if(roomNums[i] > max){
                max = roomNums[i];
            }
        }

        System.out.println(max);
    }
}
