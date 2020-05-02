(print "Enter the number:")
(setq x(read))
(defun fact(n)
(cond
(if(= n 0) 1)
(t(* n fact(- n 1)))))
(format t "Factorial of the number is:" (fact n))