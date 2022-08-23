<div align = "center">
  <h1> Java Lain </h1>
</div>

<div align = "center">
  <h2> Looping Bersarang </h2>
</div>


<div align="center">
  <a href="https://github.com/falahdrrhmn/Tutorial-Java/blob/main/README.md">(Basic Java)</a>
</div>

<br>

```java
package JavaBasic;

public class LoopingBersarang {
    public static void main(String[] args) {
        //  kotak 1
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(" * ");
            }
            System.out.println("\n");
        }
        
        System.out.println("\n");
        
        // segitiga siku-siku
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" * ");
                if (i == j){
                    break;
                }
            }
            System.out.println("\n");
        }
        
        System.out.println("\n");

        // segitiga siku-siku
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" * ");
                if(i + j == 4){
                    break;
                }
            }
            System.out.println("\n");
        }

        System.out.println("\n");

        // segitiga
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(" * ");
                if (i == j){
                    break;
                } else if (i + j ==8 ){
                    break;

                }
            }
            System.out.println("\n");
        }

        System.out.println("\n");

        // segitiga
        
        int n = 5;
        for (int i = 0; i < n; i++) {

            // inner loop to handle number spaces
            // values changing acc. to requirement
            for (int j = n - i; j > 1; j--) {
                // printing spaces
                System.out.print(" ");
            }

            // inner loop to handle number of columns
            // values changing acc. to outer loop
            for (int j = 0; j <= i; j++) {
                // printing stars
                System.out.print("* ");
            }

            // ending line after each row
            System.out.println();
        }
        
    }
}

```

output

```java 
 *  *  *  *  * 

 *  *  *  *  * 

 *  *  *  *  * 

 *  *  *  *  *

 *  *  *  *  *



 *

 *  *

 *  *  *

 *  *  *  * 

 *  *  *  *  *



 *  *  *  *  *

 *  *  *  *

 *  *  *

 *  *

 *



 * 

 *  *

 *  *  *

 *  *  *  *

 *  *  *  *  *

 *  *  *  *

 *  *  *

 *  * 

 *



    *
   * *
  * * *
 * * * *
* * * * *
```
