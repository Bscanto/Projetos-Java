package aula13_SelectShort;

class SelectionSort {
    
  public static void selectionSort(int[] arr) {
        int n = arr.length;//Define a variável "n" como o tamanho do array.
 
        for (int i = 0; i < n-1; i++) {// Percorre todo o Array
            int min_idx = i;// supõe que o menor elemento é o primeiro do subarray não ordenado
            // encontra o menor elemento no subarray não ordenado
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;// atualiza o índice do menor elemento encontrado
                }
            }
            // coloca o menor elemento na posição correta
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
public class Trabalho_Select_Short {
     public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11,6 ,25 ,14 ,3 ,1 , 9 ,7 ,8 ,4 ,15, 18 ,34, 19};
        System.out.println("Array antes da ordenacao: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
 
        SelectionSort.selectionSort(arr);
        System.out.println("Array apos a ordenacao: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}