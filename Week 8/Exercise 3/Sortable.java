/**
 *
 * @author Moaibad
 */
abstract class Sortable {
    public abstract int compare(Sortable b);
    public static void shell_sort(Sortable[] a){     
        //Shell sort body
        
        /*For loop sampai interval 1*/
        for(int interval = a.length/2; interval>0 ; interval/=2){
            
            /*For loop membandingkan dua buah elemen berdasarkan interval*/
            for(int i = interval; i<a.length; i++){
                int j = i;
                
                /*Proses swap apabila elemen tidak sort by ascending dengan method compare*/
                while(j>= interval && a[j].compare(a[j-interval]) < 0){
                    Sortable temp = a[j];
                    a[j] = a[j-interval];
                    a[j-interval] = temp;
                    j = j-interval;
                }
            }
        }
    }
}
