package gov.irs.enumtype;

import gov.irs.TaxPayer;

public interface IRS {

  static IRS getInstance(){
    return IRSEnum.INSTANCE;
  }

  void collectTaxes(); // abstract is implied in an interface methods.

  void register(TaxPayer payer);


  }

