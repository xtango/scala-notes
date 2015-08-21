/**
 * PARTIALS
 */
scala> def ratio(n: Double)(d: Double): Double = n/d
ratio: (n: Double)(d: Double)Double

scala> ratio(10)(2)
res6: Double = 5.0

// Partial apply a func with an underscore
scala> val half = ratio(_: Double) (2.0)

scala> half: Double => Double = <function1>

scala> half(10.0)
res7: Double = 5.0

/**
 * CURRYING
 */
// Take func with multiple args 
 scala> def volume(a: Int, b: Int, c: Int) : Int = a*b*c
volume: (a: Int, b: Int, c: Int)Int

scala> volume(1,2,3)
res11: Int = 6

// And curry it
scala> val curriedVolume = (volume _).curried
curriedVolume: Int => (Int => (Int => Int)) = <function1>

scala> def cubeVolume(x: Int) = curriedVolume(x)(x)(x) 
cubeVolume: (x: Int)Int

scala> cubeVolume(10)
res13: Int = 1000
