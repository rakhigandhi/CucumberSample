Feature: Guest Checkout Feature

@Sample
Scenario: Guest Checkout
Given user navigates to site
When search for a product and view PDP page
And click Home Delivery button on PDP
And Click on View Cart button
Then Checkout button should be displayed on View cart page

