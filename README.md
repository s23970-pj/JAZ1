# JAZ1
Spring - NOTES

Czym jest Spring Boot?
▪ Narzędziem do tworzenia aplikacji.
▪ Dostarcza domyślne konfiguracje modułów spring.
▪ Opiera się o zasadę convention over configuration. - to ustawienie domyślnej konfiguracji w kodzie i frameworkach, zamiast wymogu konfigurowania każdego elementu aplikacji. W praktyce, oznacza to, że w frameworku lub bibliotece programistycznej, istnieją domyślne konwencje, które opisują, jak powinny być nazwane pliki, katalogi, klasy i metody, jakie zależności powinny być automatycznie wstrzykiwane i jakie są domyślne zachowania. Dzięki temu programista może skupić się na implementacji biznesowej logiki, a nie na definiowaniu każdej szczegółowej konfiguracji.
▪ Został napisany przez Pivotal Team, 
▪ Jest następnym, głównym elementem większości aplikacji springowych, 
▪ Stworzony z myślą o mikroserwisach, - mikrosierwisy to tworzenie oprogramowania gdzie aplikacja składa się z małych samodzielnych usług. Każda z nich działa w izolacji i może być rozwijana niezależnie od innych usług.


@Configuration - służy do oznaczania klas które tworzą konfigurację aplikacji. 
@Configuration oznacza, że klasa ta zawiera metody które konfigurują beany, czyli komponenty, które będą zarządzane przez kontener springa. Metody te są oznaczone adnotacją @Bean a ich zwracany typ jest typem beana.

Adnotacja @Value w Springu służy do wstrzykiwania wartości zewnętrznych do beana. 
Adnotacja ta może być użyta na polach klasy, w której chcemy wstrzyknąć wartość, lub na parametrach konstruktora lub metody, która tworzy bean.
np.
@Component
public class printOwnValue {   //trzeba dodać Component żeby spring wiedział że to jego część
 public printOwnValue(@Value("${my.own.value}") String valueFromProperties){
     System.out.println(valueFromProperties);
 }
}

