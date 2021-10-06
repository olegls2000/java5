package lesson4;
//TODO rename
public class HomeWork {
    public static void main(String[] args) {

        int[][] array = {{3, 4}, {6, 0}, {-6, 10, 6}};

        int min = array[0][0]; //условие для определения мин. макс. в каждой скобке * дополнено
        int iMax = 0; //// дополнено
        int jMax = 0; //// дополнено
        for (int i = 0; i < array.length; i++) { //fori + tab
            //// int [] innerArray = array[i];
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > array[iMax][jMax]) { //условие для определения мин. макс. * дополнено
                    //// min = innerArray[j]; //условие для определения мин. макс. * дополнено
                    iMax = i;
                    jMax = j;
                }
                //System.out.println(innerArray[j]); //удалено, для нового условия

            }
            ////  System.out.println("Min value : " + min);

        }
        System.out.println("Max value " + array[iMax][jMax]);



        // находим минимум в двумерном массиве


        int[][] minarray = {{3, 4}, {6, 0}, {-6, 10, 6}};
        int minimal  = minarray[0][0]; //условие для определения мин. макс. в каждой скобке * дополнено
        int iMin = 0; //// дополнено
        int jMin = 0; //// дополнено
        for (int i = 0; i < minarray.length; i++) { //fori + tab
            //// int [] innerArray = array[i];
            for (int j = 0; j < minarray[i].length; j++) {
                if (minarray[i][j] <= minarray[iMin][jMin]) { // почему при знаке меньше не ищет минимальное, только вместе с =?
                    //// min = innerArray[j]; //условие для определения мин. макс. * дополнено
                    iMin = i;
                    jMin = j;
                }
                //System.out.println(innerArray[j]); //удалено, для нового условия

            }
            ////  System.out.println("Min value : " + min);

        }
        System.out.println("Min value " + array[iMin][jMin]);







        int[][] minmaxarray = {{3, 4}, {6, 0}, {-6, 10, 6}};
        int minimalmaximal = minmaxarray[0][0];
        int iMinn = 0;
        int jMinn = 0;
        int iMaxx = 0;
        int jMaxx = 0;
        for (int i = 0; i < minmaxarray.length; i++) {
            for (int j = 0; j < minmaxarray[i].length; j++) {
                if (minmaxarray[i][j] <= minmaxarray[iMinn][jMinn]) {
                    iMinn = i;
                    jMinn = j;
                }
                if (minmaxarray[i][j] > minmaxarray[iMaxx][jMaxx]) { //
                    iMaxx = i;
                    jMaxx = j;
                }


                //int tmp = minmaxarray[iMinn][jMinn][iMaxx][jMaxx];
                //array[iMinn][jMinn][iMaxx][jMaxx] = array[iMinn][jMinn][iMaxx][jMaxx];
                //array[iMinn][jMinn][iMaxx][jMaxx] = tmp;
                //return array;

            }

        }
        System.out.println("Min value " + array[iMinn][jMinn] + " and max value " + array[iMaxx][jMaxx]);

    }

}
