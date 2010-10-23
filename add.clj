(defn add 
	"Demonstartes multiple arity on a function"
	([x y]
		(+ x y))
	([x y z]
		(+ x y z)))
		
(defn my-add
	"Takes a List as an argument , variable number of arguments can be passed to the function"
	[& numbers]
		(apply + numbers))
		
(defn accum-sum
	"Uses the accumulator pasing style to calculate sum, recur is in tail position"
	[numbers acc]
		(if (empty? numbers)
			acc
			(recur (rest numbers) (+ acc (first numbers)))))
		
(println (my-add 2 3 4 5 1))

(println (accum-sum '(1 2 3 4 5) 0))