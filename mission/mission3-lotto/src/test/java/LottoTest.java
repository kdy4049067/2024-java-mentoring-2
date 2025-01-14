import Lotto.domain.Lotto;
import Lotto.domain.LottoNumber;
import Lotto.domain.RandomLottoNumber;
import Lotto.view.InputView;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("로또 테스트")
public class LottoTest {

    @DisplayName("로또 구매 테스트")
    @Test
    void testValidPrice(){

        Lotto lotto = new Lotto(new RandomLottoNumber());


    }
}
