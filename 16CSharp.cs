class Program{
        static void Main(string[] args)
        {
            // Variable declaration and assignment
            int number = 10;
            string name = "John Doe";
            double pi = 3.14;

            // Outputting variables
            Console.WriteLine("Number: " + number);
            Console.WriteLine("Name: " + name);
            Console.WriteLine("Pi: " + pi);

            // Basic arithmetic operations
            int sum = number + 5;
            int product = number * 2;
            double division = number / 3.0;

            // Outputting results of arithmetic operations
            Console.WriteLine("Sum: " + sum);
            Console.WriteLine("Product: " + product);
            Console.WriteLine("Division: " + division);

            // Conditional statement
            if (number > 5)
            {
                Console.WriteLine("Number is greater than 5");
            }
            else
            {
                Console.WriteLine("Number is less than or equal to 5");
            }

            // Looping statement
            for (int i = 1; i <= 5; i++)
            {
                Console.WriteLine("Count: " + i);
            }

            // Array declaration and iteration
            int[] numbers = { 1, 2, 3, 4, 5 };
            foreach (int num in numbers)
            {
                Console.WriteLine("Number: " + num);
            }

            // Function definition and invocation
            int result = AddNumbers(3, 5);
            Console.WriteLine("Result: " + result);

            // String concatenation
            string greeting = "Hello";
            string fullName = greeting + " " + name;
            Console.WriteLine("Full Name: " + fullName);

            // Reading input from the user
            Console.Write("Enter your age: ");
            int age = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Your age is: " + age);

            // Pausing the console before exit
            Console.WriteLine("Press any key to exit...");
            Console.ReadKey();
        }

        // Function to add two numbers
        static int AddNumbers(int a, int b)
        {
            return a + b;
        }
}
