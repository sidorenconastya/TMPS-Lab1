# Паттерн «Абстрактная Фабрика» (insurance_factory package)

Абстрактная фабрика предоставляет интерфейс для создания целых семейств объектов без указания конкретных классов. Объекты каждого семейства должны быть логически связаны между собой.

В данном примере семейством объектов являются типы страхования, которые отличаются друг от друга значением указанных атрибутов: названием, размером выплат и случаем страхования. 

Интерфейс абстрактной фабрики:
```sh
public interface InsuranceFactoryInterface {
	public InsuranceInterface createInsurance(); 
}
```

Также для каждого типа страхования необходимо определить класс фабрики, который будет имплементировать указанный ранее интерфейс. 

Например:
```sh
public class RcaFactory implements InsuranceFactoryInterface {
	private RcaFactory() {}
	@Override
	public InsuranceInterface createInsurance(){
		return new Rca();
	}
}
```

# Паттерн «Фабричный метод» (transport_factory package)

Данный паттерн делегирует операцию создания экземпляра подклассам. Это использовать позволяет в коде программы не специфические классы, а манипулировать абстрактными объектами на более высоком уровне.

В данном примере создается абстрактный класс TransportFactory с методом createTransport(), который имеет разную имплементацию в зависимости от класса, наследующего данный абстрактный класс. Например, реализация вышесказанного метода в классе CarFactory:
```sh
public Transport createTransport() {
		return new Car();
	}
  ```
  
# Паттерн «Строитель» (классы Car и Boat)
Данный паттерн позволяет облегчить создание сложных объектов, обеспечивая их создание пошагово. С помощью этого паттерна можно использовать один и тот же код строительства для получения разных представлений объектов. 

В текущем примере удобно использовать строитель в классах Car и Boat, так как при дальнейшем создании экземпляров этих классов можно будет указать различные характеристики путем вызова метода build();

В каждом из этих классов создается класс Builder, содержащий набор методов, характерных для всевозможных экземпляров данного класса.

# Паттерн «Одиночка» (классы CarFactory и BoatFactory)
Этот паттерн гарантирует, что у класса есть только один экземпляр, и предоставляет к нему глобальную точку доступа.

В данном примере шаблон используется в вышеуказанных классах, так как можно с уверенностью сказать, что не может быть больше одного экземпляра классов фабрики.
```sh
public class CarFactory extends TransportFactory{
	private static CarFactory carFactory = new CarFactory();
	
	private CarFactory() {}
	
	public static CarFactory getCarFactory() {
		if (carFactory == null)
			carFactory = new CarFactory();
		return carFactory;
	}
  ```

