/*Test qaçırıcı — dynamic dispatch
Test ata class-ında icraEt() metodu olsun. Ondan UITest,
APITest və DBTest varislərini törət — hər biri icraEt()-i öz cür override etsin.
Sonra ata tipli bir massiv (Test[]) yarat, içinə hər üç növdən obyekt qoy və for-each ilə
hamısının icraEt()-ini çağır. Kodu dəyişmədən hər obyektin öz versiyasını işlətdiyinə əmin ol
 */


public class Main {
    public static void main(String[] args) {
        Test[] testler = {
                new UITest(),
                new APITest(),
                new DBTest()
        };

        System.out.println("   Testlərin İcrası Başladı   ");
        for (Test test : testler) {
            test.icraEt();
        }
    }
}

/* Dynamic Method Dispatch: Javanın hansı metodu çağıracağını
obyektin tipinə görə icra zamanı (runtime) müəyyən etməsidir.
*/