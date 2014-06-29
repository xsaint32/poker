import org.junit.*

@Mixin(RankTestMixin)
class FullHouseTest {

  @Test
  public void should_set_rank_on_visit() {
    checkVisit(Hand.mockFullHouse(), FullHouse)
  }

  @Ignore
  @Test
  public void should_return_rank() {
    def rank = new FullHouse()

    assert rank.evaluate(Hand.mockFullHouse()) == true
    assert rank.evaluate(Hand.mockFlush()) == false
    assert rank.evaluate(Hand.mockStraight()) == false
    assert rank.evaluate(Hand.mockThreeOfAKind()) == false
    assert rank.evaluate(Hand.mockTwoPair()) == false
    assert rank.evaluate(Hand.mockPair()) == false
    assert rank.evaluate(Hand.mockHighCard()) == false
  }
}