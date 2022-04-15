import org.scalatest._
import flatspec._
import matchers._
import AdditivePersistence._

class AdditivePersistenceSpec extends AnyFlatSpec with should.Matchers {

  it should "return the additive persistence of a number" in {
    additivePers(13) shouldBe 1
    additivePers(1234) shouldBe 2
    additivePers(9876) shouldBe 2
    additivePers(199) shouldBe 3
  }
}