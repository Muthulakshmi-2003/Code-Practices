import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[][] images = {{1,0,0},{1,0,1},{0,0,0}};
        System.out.println("Images are :"+ Arrays.deepToString(images));

        for(int i = 0; i< images[i].length ;i++){
            int left = 0;
            int right = images[i].length - 1;
            System.out.println("right: "+ right);

            while(left<=right){
                int temp = images[i][left];
                System.out.println("Temp : "+ temp);
                images[i][left] = 1 - images[i][right];
                System.out.println("images[i][left] "+images[i][left]);
                images[i][right] = 1- temp;
                System.out.println("images[i][right] "+images[i][right]);
                left++;
                System.out.println("left++ : "+ left);
                right--;
                System.out.println("right-- : "+ right);

            }
        }
        System.out.println("Flipping images are : "+ Arrays.deepToString(images));



    }


    }

