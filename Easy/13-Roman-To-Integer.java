class Solution {
    public int romanToInt(String s) {
        String [] letter = s.split("");
        int value = 0;
        for (int i = letter.length-1; i >= 0; i--) {
            //M
            switch (letter[i]) {
                case "M" -> {
                    if (i!=0) {
                        value += (letter[i - 1].equals("C")) ? 900 : 1000;
                        i -= (letter[i - 1].equals("C")) ? 1 : 0;
                    } else {
                        value+=1000;
                    }
                }
                //D
                case "D" -> {
                    if (i!=0) {
                        value += (letter[i - 1].equals("C")) ? 400 : 500;
                        i -= (letter[i - 1].equals("C")) ? 1 : 0;
                    } else{
                        value+=500;
                    }
                }
                //C
                case "C" -> {
                    if (i!=0) {
                        value += (letter[i - 1].equals("X")) ? 90 : 100;
                        i -= (letter[i - 1].equals("X")) ? 1 : 0;
                    } else{
                        value+=100;
                    }
                }
                //L
                case "L" -> {
                    if (i!=0) {
                        value += (letter[i - 1].equals("X")) ? 40 : 50;
                        i -= (letter[i - 1].equals("X")) ? 1 : 0;
                    } else{
                        value+=50;
                    }
                }
                //X
                case "X" -> {
                    if (i!=0) {
                        value += (letter[i - 1].equals("I")) ? 9 : 10;
                        i -= (letter[i - 1].equals("I")) ? 1 : 0;
                    } else{
                        value+=10;
                    }
                }
                //V
                case "V" -> {
                    if (i != 0) {
                        value += (letter[i - 1].equals("I")) ? 4 : 5;
                        i -= (letter[i - 1].equals("I")) ? 1 : 0;
                    } else{
                        value+=5;
                    }
                }
                default -> value++;
            }
            System.out.println(value);
        }


        return value;
    }
}