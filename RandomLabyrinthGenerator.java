
    import java.util.Random;

public class RandomLabyrinthGenerator  {
    public static void main(String[] args) {
        int[][] labyrinth = new int[20][20];
        Random rnd = new Random();

        
        for (int floor = 0; floor < 20; floor++) {
            int[] oddNumbers = new int[10];
            int[] evenNumber = new int[10];
            int oddIndex= 0;
            int evenIndex = 0;

            
            while (oddIndex < 10) {
                int number= rnd.nextInt(99) + 1;
                boolean exists = false;
                for (int i = 0; i < oddIndex; i++) {
                    if (oddNumbers[i] == number) {
                       exists  = true;
                        break;
                    }
                }
                if (number % 2 == 1 && !exists ) {
                    oddNumbers[oddIndex++] = number;
                }
            }

        
            while (evenIndex  < 10) {
                int number1 = rnd.nextInt(99) + 1;
                boolean exists  = false;
                for (int i = 0; i < evenIndex; i++) {
                    if (evenNumber [i] == number1) {
                       exists  = true;
                        break;
                    }
                }
                if (number1 % 2 == 0 && !exists ) {
                    evenNumber[evenIndex++] = number1;
                }
            }

            
            int[] allNumber = new int[20];
            for (int i = 0; i < 10; i++) {
                allNumber[i] = oddNumbers[i];
                allNumber[i + 10] = evenNumber[i];
            }

            
            int[] mix = new int[20];
            int assigned = 0;
            while (assigned < 20) {
                int index = rnd.nextInt(20);
                int number2 = allNumber[index];
                boolean exists= false;
                for (int i = 0; i < assigned; i++) {
                    if (mix[i] == number2) {
                        exists = true;
                        break;
                    }
                }
                if (!exists) {
                    mix[assigned] = number2;
                    labyrinth[floor][assigned] = number2;
                   assigned++;
                }
            }
        }

        
        System.out.println("Floors and Doors:");
        for (int floor = 0; floor< 20; floor++) {
            System.out.print((floor+ 1) + ". Floor: ");
            for (int door = 0; door < 20; door++) {
                System.out.print(labyrinth[floor][door] + " ");
            }
            System.out.println();
        }

        
        int count = 0;
        int first= 0;
        for (int j = 0; j < 20; j++) {
            if (labyrinth[0][j] % 2 != 0) {
                count++;
                if (count == 3) {
                    System.out.println("The 3rd odd number in the 1st row: " + labyrinth[0][j]);
                    first = labyrinth[0][j];
                    break;
                }
            }
        }

        
        count = 0;
        int second= 0;
        for (int j = 0; j < 20; j++) {
            if (labyrinth[19][j] % 2 != 0) {
                count++;
                if (count == 3) {
                    System.out.println("The 3st odd number in the 20th row: " + labyrinth[19][j]);
                    second =labyrinth [19][j];
                    break;
                }
            }
        }


        int Sum = first + second;
        System.out.println("Toplam: " + Sum);
    }
}