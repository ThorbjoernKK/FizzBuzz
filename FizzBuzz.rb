i=1
num=100
while i<num+1
	if (i%3).zero?
		if (i%15).zero?
		puts "FizzBuzz"
		else
		puts "Fizz"
		end
	elsif (i%5).zero?
		if (i%15).zero?
		puts "FizzBuzz"
		else
		puts "Buzz"
		end
	else
	puts i.to_s
	end
i+=1
end