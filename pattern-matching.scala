case class Security(secType : String, name: String)
defined class Security

scala> val eq = Security("Equity", "GOOG")
eq: Security = Security(Equity,GOOG)

scala> val debt = Security("Bond", "AAPL")
debt: Security = Security(Bond,AAPL)

scala> def secType(sec: Security) = sec match {
  case Security("Bond", _) => "It's a bond"
  case Security("Equity", _) => "It's a stock"
  case Security(someType, _) => "%s is an unknown type".format(someType)
}
     |      |      |      | secType: (sec: Security)String

scala> secType(debt)
res19: String = It's a bond

scala> secType(eq)
res22: String = It's a stock
