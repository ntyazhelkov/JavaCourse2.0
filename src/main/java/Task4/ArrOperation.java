package Task4;


public class ArrOperation {
    public static void main(String[] args) {
        int[] randArr = new int[20];

        for (int i = 0; i < randArr.length; i++) {
            randArr[i] = ((int)(Math.random() * 21) - 10);
            System.out.print(randArr[i] + " ");
        }
        int indexMax = 0;
        int indexMin = 0;
        int valMax = 0, valMin = 0;
        for(int i = 0; i < randArr.length; i++) {
            if (randArr[i] == getMin(randArr)) {
                indexMin = i;
                valMin = getMin(randArr);
            } else if (randArr[i] == getMax(randArr)) {
                indexMax = i;
                valMax = getMax(randArr);
            }
        }
        randArr[indexMax] = valMin;
        randArr[indexMin] = valMax;

        System.out.println("\n" + "-------------swap Max and Min----------------");

        for (int i = 0; i < randArr.length; i++) {
            System.out.print(randArr[i] + " ");
        }

    }

            //здесь находим максимум сред отрицательных чисел
    public static int getMax(int[] inputArray){
        int maxValue = -10;
        for(int i=1;i < inputArray.length;i++){
            if((inputArray[i] > maxValue) & (inputArray[i] < 0)){
                maxValue = inputArray[i];
        }
        }
        return maxValue;
    }

        // здесь находим минимум среди  положительных чисел
    public static int getMin(int[] inputArray){
        int minValue = 10;
        for(int i=1;i<inputArray.length;i++){
            if((inputArray[i] < minValue) & (inputArray[i] > 0)){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }

}
