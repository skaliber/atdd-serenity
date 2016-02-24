package com.xpinjection.bank;

import net.thucydides.core.annotations.Feature;

public class BankApplication {
    @Feature
    public class AccountsManagement {
        public class MultipleUsersSupport {}
        public class MultipleAccountsPerUser {}
        public class UserNameSuggestions {}
    }
    @Feature
    public class MoneyOperations {
        public class GetMoneyFromAccount {}
        public class PutMoneyToAccount {}
        public class TransferMoneyBetweenAccounts {}
    }
}


