Feature: Test

Scenario: Click Sell Stock
Given User is in trading-page Page
And User have stock-list
When User Click setting button
And User Select sell
Then stock-detail are Displayed

Scenario: Set Sell Stock
Given User is in stock-detail
When User Input sell-order-lot
And User Input price
And User Select order-type
Then Verify proceeds-net-fee multiplication of sell-order-lot and price and fee
And Verify profit-loss is Filled

Scenario: Click Place Order button
Given place-order button is Enabled
When User Clik place-order button
Then preview-order are Displayed
And Verify preview-order-stock is Filled
And Verify preview-order-expiry is Filled
And Verify preview-order-lot is Filled
And Verify preview-order-price is Filled
And Verify preview-order-proceed-amount is Filled
And Verify preview-order-broker-fee is Filled
And Verify preview-order-exchange-fee is Filled
And Verify preview-order-proceeds-net-fee is Filled
And Verify preview-order-profit-loss is Filled
And User Click confirm button
And User Click done button



  