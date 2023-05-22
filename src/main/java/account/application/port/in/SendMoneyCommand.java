package account.application.port.in;

import account.domain.Account.AccountId;
import account.domain.Money;
import common.SelfValidating;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;


@Getter
public class SendMoneyCommand extends SelfValidating<SendMoneyCommand> {
    @NotNull
   private final AccountId sourceAccountId;
   private final AccountId targetAccountId;
   private final Money money;
    public SendMoneyCommand(AccountId sourceAccountId, AccountId targetAccountId, Money money) {
        this.sourceAccountId = sourceAccountId;
        this.targetAccountId = targetAccountId;
        this.money = money;
        this.validateSelf();
    }
}
