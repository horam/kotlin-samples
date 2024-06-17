fun main() {
    /// List
 
    val readOnlyShapes = listOf("triangle", "sqaure", "circle");
   
    print("print the first item : ${readOnlyShapes.first()}");
    println("the length is: ${readOnlyShapes.count()}")
    
    
    val shapes: MutableList<String> = mutableListOf("triangle", "sqaure", "circle");
    shapes.add("pentagon");
    println("the mutable list length is: ${shapes.count()}");
    shapes.remove("square");
    println("the last item is: ${shapes.last()}");
    
    println("rectangle" in shapes);
    
    /// set
    val readOnlyFruit = setOf("apple","banana","cherry", "banana");
    println(readOnlyFruit.count());
    
    val fruits: MutableSet<String> = mutableSetOf("apple","banana","cherry", "banana");
    println(fruits.count());
    fruits.add("tomato");
    println(fruits.count());
    
    /// Map
    
    
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 200, "orange" to 300);
    println(readOnlyJuiceMenu);
    
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 200, "orange" to 300);
    println("${juiceMenu["apple"]}");
    
    juiceMenu.put("coconut", 500);
    
    println("${juiceMenu.count()}");
    
    val test: Boolean = juiceMenu.containsKey("kiwi");
    println(test);
    
    println(juiceMenu.keys);
    println(juiceMenu.values);
    
    
    // if 
    
    val dataPoint: Int
    val check = true

    if (check) {
       dataPoint = 1;
    } else {
      dataPoint = 2;
    }

    println(dataPoint);
    
    
    val a = 1;
    val b = 2;
    
    val result = if (a > b) a else b;
    
    println(result);
    
    // when: a replacement for switch..case
    val obj = "Hello"
    
    
    val demo =when (obj){
        "a" -> "object is a.";
        "Hello" -> "object is Hello.";
        else -> "unknown.";
    }
    
    println(demo);
    
    val temp =18;
    
    val description = when {
        temp < 0 -> "very cold.";
        
        temp < 10 -> "a bit cold.";
        
        temp < 20 -> "warm.";
        
        else -> "hot";
    }
    
    println(description);
    
    
    // range
    for (number in 1..5){
        println("number is : $number.");
    }
    
    
    val cakes = listOf("carrot", "cheese", "chocolate");
    
    for (cake in cakes){
        println("Yummy, it's $cake cake!");
    }
    
    // while
    
    var cakesEaten =0;
    var cakesBaked =0;
    
    while(cakesEaten < 3){
        println("Eat a cake.");
        cakesEaten++;
    }
    
    
    do{
        println("Bake a cake.");
        cakesBaked++;
    }while(cakesBaked < 3)
    
    
    /// function
    
    // function without return.
    fun printMessage(message: String){
        println("message is: $message");
    }
    
    // inline function.
    fun sum(x: Int, y:Int) = x + y; 
    
    // normal function with return.
    fun sumDemo(x:Int, y:Int): Int{
        print("inside demo sum function");
        return x+y
    }
    
    printMessage("test function in kotlin");
    
    printMessage("sum equals ${sum(1,2)}");
    
    printMessage("sumDemo equals ${sumDemo(1,2)}");
    
    // lambda function
    fun upperCaseString(text: String) = text.uppercase();
    // here the lambda expression is defined and invoked by 
    // its own.
    println({ text: String -> text.uppercase()}("hello"));
    
    val numbers = listOf(1, -2, 3, -4, 5, -6);
    
    // exmaple of a lambda function.
    val positives = numbers.filter{ x -> x > 0 };
    
    val doubled = numbers.map{x -> x * 2};
    
    println("positive values are: $positives");
    println("doubled values are: $doubled");
    
    // (Int) -> Int means it always returns  a lambda expression
    // that takes an Int input and retunrs and Int output.
    fun toSeconds(time: String): (Int) -> Int = when (time){
        "hour" -> { value -> value * 3600 }
        "minute" -> { value -> value * 60 }
        "second" -> { value -> value }
        else -> { value -> value }
    }
    
    val timesInMinutes = listOf(2, 10, 15, 1)
    
    val res = toSeconds("hour");
    
    val resFinal = timesInMinutes.map(res).sum()
        
    println("$resFinal");
    
    // The initial value is zero. 
    // The operation sums the initial value with every item in the list cumulatively.
    // fold accepts an initial value and an operation.
    println(listOf(1, 2, 3).fold(0, { x, item -> x + item })) // 6
    
    // Alternatively, in the form of a trailing lambda
    println(listOf(1, 2, 3).fold(0) { x, item -> x + item }) 
    
    
    // example of using lambda functions:
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map { action -> "$prefix/$id/$action" }
    println(urls);
    
    // example of lambda function.
    fun repeatN(n: Int, action: () -> Unit) {
    for (i in 1..n){
        action();
     }
   }
    
   repeatN(5){
       println("Hello")
   }

  
}