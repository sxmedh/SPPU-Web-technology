# Variable declaration and assignment
number = 10
name = "John Doe"
pi = 3.14

# Outputting variables
puts "Number: #{number}"
puts "Name: #{name}"
puts "Pi: #{pi}"

# Basic arithmetic operations
sum = number + 5
product = number * 2
division = number / 3.0

# Outputting results of arithmetic operations
puts "Sum: #{sum}"
puts "Product: #{product}"
puts "Division: #{division}"

# Conditional statement
if number > 5
  puts "Number is greater than 5"
else
  puts "Number is less than or equal to 5"
end

# Looping statement
5.times do |i|
  puts "Count: #{i + 1}"
end

# Array declaration and iteration
numbers = [1, 2, 3, 4, 5]
numbers.each do |num|
  puts "Number: #{num}"
end

# Function definition and invocation
def add_numbers(a, b)
  a + b
end

result = add_numbers(3, 5)
puts "Result: #{result}"

# String concatenation
greeting = "Hello"
full_name = "#{greeting} #{name}"
puts "Full Name: #{full_name}"

# Reading input from the user
print "Enter your age: "
age = gets.chomp.to_i
puts "Your age is: #{age}"

# Pausing the console before exit
puts "Press enter to exit..."
gets
