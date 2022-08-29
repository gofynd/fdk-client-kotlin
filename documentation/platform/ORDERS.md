



##### [Back to Platform docs](./README.md)

## Orders Methods
Handles all platform order and shipment api(s)
* [getShipmentDetails](#getshipmentdetails)
* [getLaneConfig](#getlaneconfig)
* [getOrderShipmentDetails](#getordershipmentdetails)
* [getShipmentList](#getshipmentlist)
* [getShipmentToManifest](#getshipmenttomanifest)
* [getOrders](#getorders)
* [getMetricCount](#getmetriccount)
* [getfilters](#getfilters)
* [getApplicationShipments](#getapplicationshipments)
* [createShipmentReport](#createshipmentreport)
* [getReportsShipmentListing](#getreportsshipmentlisting)
* [upsertJioCode](#upsertjiocode)



## Methods with example and description


### getShipmentDetails





```kotlin
client.orders.getShipmentDetails(shipmentId: shipmentId, orderingCompanyId: orderingCompanyId, requestByExt: requestByExt).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| shipmentId | String | yes |  |   
| orderingCompanyId | String? | no |  |   
| requestByExt | String? | no |  |  





*Returned Response:*




[ShipmentInfoResponse](#ShipmentInfoResponse)

We are processing the report!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true,
  "order": {
    "fynd_order_id": "FY62B13E2101810C19E4",
    "shipment_count": 1,
    "order_date": "2022-06-21T09:12:26+00:00"
  },
  "shipments": [
    {
      "shipment_id": "16557829457641286433",
      "payment_mode": "COD",
      "fulfilling_store": {
        "id": 1,
        "code": "HS-468a5",
        "fulfillment_channel": "pulse",
        "store_name": "Reliance Industries Ltd - Jio Market",
        "contact_person": "",
        "phone": "8268108880",
        "address": "high_street WEWORK, VIJAY DIAMONDS, ANDHERI MUMBAI MAHARASHTRA 400093",
        "city": "MUMBAI",
        "state": "MAHARASHTRA",
        "country": "INDIA",
        "pincode": 400093
      },
      "delivery_details": {
        "name": "Manish Prakash",
        "email": "Manish.Prakash@ril.com",
        "phone": "7787051611",
        "address": "home 479 sector3 bokaro Bokaro Jharkhand 827003",
        "city": "Bokaro",
        "state": "Jharkhand",
        "country": "India",
        "pincode": "827003",
        "state_code": 0
      },
      "billing_details": {
        "name": "Manish Prakash",
        "email": "Manish.Prakash@ril.com",
        "phone": "7787051611",
        "address": "home 479 sector3 bokaro Bokaro Jharkhand 827003",
        "city": "Bokaro",
        "state": "Jharkhand",
        "country": "India",
        "pincode": "827003",
        "state_code": 0
      },
      "dp_details": {
        "id": null,
        "name": null,
        "awb_no": null,
        "eway_bill_id": null,
        "track_url": null,
        "gst_tag": "sgst"
      },
      "journey_type": "forward",
      "order": {
        "fynd_order_id": "FY62B13E2101810C19E4",
        "affiliate_id": "000000000000000000000001",
        "ordering_channel": "FYND",
        "source": null,
        "tax_details": {
          "gstin": null
        },
        "order_date": "2022-06-21T09:12:26+00:00"
      },
      "gst_details": {
        "value_of_good": 475.24,
        "gst_fee": 23.76,
        "brand_calculated_amount": 499,
        "tax_collected_at_source": 0,
        "gstin_code": null
      },
      "shipment_quantity": 1,
      "bag_status_history": [
        {
          "status": "pending",
          "updated_at": "2022-06-21T09:12:26+00:00",
          "state_type": "operational",
          "app_display_name": "Pending",
          "display_name": "Pending",
          "forward": null
        },
        {
          "status": "placed",
          "updated_at": "2022-06-21T09:12:32+00:00",
          "state_type": "operational",
          "app_display_name": "Ordered",
          "display_name": "Placed",
          "forward": null
        },
        {
          "status": "bag_confirmed",
          "updated_at": "2022-06-21T09:39:13+00:00",
          "state_type": "operational",
          "app_display_name": "Ordered",
          "display_name": "Bag Confirmed",
          "forward": null
        },
        {
          "status": "dp_assigned",
          "updated_at": "2022-06-21T09:40:04+00:00",
          "state_type": "operational",
          "app_display_name": "DP Assigned",
          "display_name": "DP Assigned",
          "forward": null
        },
        {
          "status": "bag_picked",
          "updated_at": "2022-06-21T09:40:12+00:00",
          "state_type": "operational",
          "app_display_name": "Shipped",
          "display_name": "In Transit",
          "forward": null
        },
        {
          "status": "out_for_delivery",
          "updated_at": "2022-06-21T09:40:29+00:00",
          "state_type": "operational",
          "app_display_name": "Out For Delivery",
          "display_name": "Out For Delivery",
          "forward": null
        },
        {
          "status": "delivery_done",
          "updated_at": "2022-06-21T09:40:37+00:00",
          "state_type": "operational",
          "app_display_name": "Delivered",
          "display_name": "Delivery Done",
          "forward": null
        }
      ],
      "bags": [
        {
          "bag_id": 43880,
          "display_name": "Bag",
          "entity_type": "bag",
          "bag_configs": {
            "is_returnable": true,
            "can_be_cancelled": true,
            "enable_tracking": false,
            "is_customer_return_allowed": true,
            "allow_force_return": false,
            "is_active": false
          },
          "financial_breakup": [
            {
              "price_effective": 499,
              "discount": 0,
              "amount_paid": 549,
              "coupon_effective_discount": 0,
              "delivery_charge": 50,
              "fynd_credits": 0,
              "cod_charges": 0,
              "refund_credit": 0,
              "cashback": 0,
              "refund_amount": 549,
              "added_to_fynd_cash": false,
              "cashback_applied": 0,
              "gst_tax_percentage": 5,
              "value_of_good": 475.24,
              "price_marked": 499,
              "transfer_price": 0,
              "brand_calculated_amount": 499,
              "promotion_effective_discount": 0,
              "coupon_value": 0,
              "pm_price_split": {
                "COD": 549
              },
              "size": "5",
              "total_units": 1,
              "hsn_code": "62050000",
              "identifiers": {
                "sku_code": "CL-001L-L-PRPL-PINK-5"
              },
              "item_name": "Purple Flip Flops",
              "gst_fee": "23.76",
              "gst_tag": "IGST"
            }
          ],
          "current_status": "delivery_done",
          "item": {
            "name": "Purple Flip Flops",
            "brand": "Nike",
            "slug_key": "purple-flip-flops-ezmucvw4d3",
            "images": [
              "https://hdn-1.fynd.com/products/pictures/item/free/270x0/CL-001L-L-PRPL-PINK-6/Rvk5WbGg9Hx-1.jpg"
            ],
            "size": "5",
            "l1_category": "",
            "l3_category": "27"
          },
          "brand": {
            "modified_on": 1655707988,
            "logo": "https://hdn-1.jiomarketx0.de/x0/brands/pictures/square-logo/original/DbhIvd_tB-Logo.jpeg",
            "brand_name": "Nike",
            "company": null,
            "created_on": 1647793418,
            "id": 4
          },
          "gst_details": {
            "gstin_code": null,
            "gst_tag": "IGST",
            "hsn_code": "62050000",
            "value_of_good": 475.24,
            "gst_tax_percentage": 5,
            "is_default_hsn_code": true,
            "brand_calculated_amount": 499,
            "gst_fee": "23.76"
          },
          "article": {
            "uid": "6237fdfec0903e7ae543c201",
            "identifiers": {
              "sku_code": "CL-001L-L-PRPL-PINK-5"
            },
            "return_config": {
              "time": 30,
              "unit": "days",
              "returnable": true
            }
          },
          "quantity": 1
        }
      ],
      "delivery_slot": {
        "slot": "By 03:00 AM",
        "upper_bound": "2022-06-21T03:42:23+00:00",
        "lower_bound": "2022-06-21T03:42:23+00:00",
        "date": "2022-06-21T03:42:23+00:00",
        "type": "order_window"
      },
      "total_items": 1,
      "payment_methods": [
        {
          "slug": "COD",
          "payment_id": "COD",
          "payment_amt": 549,
          "payment_cart": null,
          "payment_desc": "COD",
          "bdcustomer_id": null,
          "order_inv_num": null,
          "mode_of_payment": "COD",
          "payment_gateway_logo": null,
          "transaction_ref_number": ""
        }
      ],
      "vertical": "GROCERIES",
      "payments": {
        "mode": "COD",
        "logo": "https://hdn-1.fynd.com/payment/Pos+Logo.png",
        "source": "Jio Partner Pay"
      },
      "priority_text": null,
      "status": {
        "created_at": 1655804437,
        "shipment_id": "16557829457641286433",
        "status": "delivery_done",
        "bag_list": [
          "43880"
        ],
        "id": 19980
      },
      "prices": {
        "amount_paid": 549,
        "refund_amount": 549,
        "price_marked": 499,
        "cod_charges": 0,
        "discount": 0,
        "cashback_applied": 0,
        "delivery_charge": 50,
        "fynd_credits": 0,
        "cashback": 0,
        "price_effective": 499,
        "refund_credit": 0,
        "value_of_good": 475.24,
        "pm_price_split": {
          "COD": 549
        },
        "brand_calculated_amount": 499,
        "coupon_effective_discount": 0,
        "tax_collected_at_source": 0,
        "promotion_effective_discount": 0
      },
      "picked_date": "",
      "tracking_list": [
        {
          "status": "Order Placed",
          "time": "2022-06-21T09:12:32+00:00",
          "is_passed": true,
          "is_current": false
        },
        {
          "status": "Order Confirmed",
          "time": "2022-06-21T09:39:13+00:00",
          "is_passed": true,
          "is_current": false
        },
        {
          "status": "Invoiced",
          "time": "2022-06-21T09:40:12+00:00",
          "is_passed": true,
          "is_current": false
        },
        {
          "status": "Delivery Partner Assigned",
          "time": "2022-06-21T09:40:12+00:00",
          "is_passed": true,
          "is_current": false
        },
        {
          "status": "Packed",
          "time": "2022-06-21T09:40:12+00:00",
          "is_passed": true,
          "is_current": false
        },
        {
          "status": "In Transit",
          "time": "2022-06-21T09:40:12+00:00",
          "is_passed": true,
          "is_current": false
        },
        {
          "status": "Out For Delivery",
          "time": "2022-06-21T09:40:29+00:00",
          "is_passed": true,
          "is_current": false
        },
        {
          "status": "Delivered",
          "time": "2022-06-21T09:40:37+00:00",
          "is_passed": true,
          "is_current": true
        }
      ],
      "user_agent": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36",
      "platform_logo": "https://fynd-static.s3.amazonaws.com/mode_of_payment/fynd_logo.png",
      "packaging_type": "POLYB_DFLT_L"
    }
  ]
}
```
</details>









---


### getLaneConfig





```kotlin
client.orders.getLaneConfig(superLane: superLane, groupEntity: groupEntity, fromDate: fromDate, toDate: toDate, dpIds: dpIds, stores: stores, salesChannel: salesChannel, paymentMode: paymentMode, bagStatus: bagStatus).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| superLane | String? | no |  |   
| groupEntity | String? | no |  |   
| fromDate | String? | no |  |   
| toDate | String? | no |  |   
| dpIds | String? | no |  |   
| stores | String? | no |  |   
| salesChannel | String? | no |  |   
| paymentMode | String? | no |  |   
| bagStatus | String? | no |  |  





*Returned Response:*




[LaneConfigResponse](#LaneConfigResponse)

Response containing count of shipments of the given status




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getOrderShipmentDetails





```kotlin
client.orders.getOrderShipmentDetails(orderId: orderId).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| orderId | String | yes |  |  





*Returned Response:*




[ShipmentDetailsResponse](#ShipmentDetailsResponse)

We are processing the report!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true,
  "order": {
    "fynd_order_id": "FY62B13E2101810C19E4",
    "shipment_count": 1,
    "order_date": "2022-06-21T09:12:26+00:00"
  },
  "shipments": [
    {
      "shipment_id": "16557829457641286433",
      "payment_mode": "COD",
      "fulfilling_store": {
        "id": 1,
        "code": "HS-468a5",
        "fulfillment_channel": "pulse",
        "store_name": "Reliance Industries Ltd - Jio Market",
        "contact_person": "",
        "phone": "8268108880",
        "address": "high_street WEWORK, VIJAY DIAMONDS, ANDHERI MUMBAI MAHARASHTRA 400093",
        "city": "MUMBAI",
        "state": "MAHARASHTRA",
        "country": "INDIA",
        "pincode": 400093
      },
      "delivery_details": {
        "name": "Manish Prakash",
        "email": "Manish.Prakash@ril.com",
        "phone": "7787051611",
        "address": "home 479 sector3 bokaro Bokaro Jharkhand 827003",
        "city": "Bokaro",
        "state": "Jharkhand",
        "country": "India",
        "pincode": "827003",
        "state_code": 0
      },
      "billing_details": {
        "name": "Manish Prakash",
        "email": "Manish.Prakash@ril.com",
        "phone": "7787051611",
        "address": "home 479 sector3 bokaro Bokaro Jharkhand 827003",
        "city": "Bokaro",
        "state": "Jharkhand",
        "country": "India",
        "pincode": "827003",
        "state_code": 0
      },
      "dp_details": {
        "id": null,
        "name": null,
        "awb_no": null,
        "eway_bill_id": null,
        "track_url": null,
        "gst_tag": "sgst"
      },
      "journey_type": "forward",
      "order": {
        "fynd_order_id": "FY62B13E2101810C19E4",
        "affiliate_id": "000000000000000000000001",
        "ordering_channel": "FYND",
        "source": null,
        "tax_details": {
          "gstin": null
        },
        "order_date": "2022-06-21T09:12:26+00:00"
      },
      "gst_details": {
        "value_of_good": 475.24,
        "gst_fee": 23.76,
        "brand_calculated_amount": 499,
        "tax_collected_at_source": 0,
        "gstin_code": null
      },
      "shipment_quantity": 1,
      "bag_status_history": [
        {
          "status": "pending",
          "updated_at": "2022-06-21T09:12:26+00:00",
          "state_type": "operational",
          "app_display_name": "Pending",
          "display_name": "Pending",
          "forward": null
        },
        {
          "status": "placed",
          "updated_at": "2022-06-21T09:12:32+00:00",
          "state_type": "operational",
          "app_display_name": "Ordered",
          "display_name": "Placed",
          "forward": null
        },
        {
          "status": "bag_confirmed",
          "updated_at": "2022-06-21T09:39:13+00:00",
          "state_type": "operational",
          "app_display_name": "Ordered",
          "display_name": "Bag Confirmed",
          "forward": null
        },
        {
          "status": "dp_assigned",
          "updated_at": "2022-06-21T09:40:04+00:00",
          "state_type": "operational",
          "app_display_name": "DP Assigned",
          "display_name": "DP Assigned",
          "forward": null
        },
        {
          "status": "bag_picked",
          "updated_at": "2022-06-21T09:40:12+00:00",
          "state_type": "operational",
          "app_display_name": "Shipped",
          "display_name": "In Transit",
          "forward": null
        },
        {
          "status": "out_for_delivery",
          "updated_at": "2022-06-21T09:40:29+00:00",
          "state_type": "operational",
          "app_display_name": "Out For Delivery",
          "display_name": "Out For Delivery",
          "forward": null
        },
        {
          "status": "delivery_done",
          "updated_at": "2022-06-21T09:40:37+00:00",
          "state_type": "operational",
          "app_display_name": "Delivered",
          "display_name": "Delivery Done",
          "forward": null
        }
      ],
      "bags": [
        {
          "bag_id": 43880,
          "display_name": "Bag",
          "entity_type": "bag",
          "bag_configs": {
            "is_returnable": true,
            "can_be_cancelled": true,
            "enable_tracking": false,
            "is_customer_return_allowed": true,
            "allow_force_return": false,
            "is_active": false
          },
          "financial_breakup": [
            {
              "price_effective": 499,
              "discount": 0,
              "amount_paid": 549,
              "coupon_effective_discount": 0,
              "delivery_charge": 50,
              "fynd_credits": 0,
              "cod_charges": 0,
              "refund_credit": 0,
              "cashback": 0,
              "refund_amount": 549,
              "added_to_fynd_cash": false,
              "cashback_applied": 0,
              "gst_tax_percentage": 5,
              "value_of_good": 475.24,
              "price_marked": 499,
              "transfer_price": 0,
              "brand_calculated_amount": 499,
              "promotion_effective_discount": 0,
              "coupon_value": 0,
              "pm_price_split": {
                "COD": 549
              },
              "size": "5",
              "total_units": 1,
              "hsn_code": "62050000",
              "identifiers": {
                "sku_code": "CL-001L-L-PRPL-PINK-5"
              },
              "item_name": "Purple Flip Flops",
              "gst_fee": "23.76",
              "gst_tag": "IGST"
            }
          ],
          "current_status": "delivery_done",
          "item": {
            "name": "Purple Flip Flops",
            "brand": "Nike",
            "slug_key": "purple-flip-flops-ezmucvw4d3",
            "images": [
              "https://hdn-1.fynd.com/products/pictures/item/free/270x0/CL-001L-L-PRPL-PINK-6/Rvk5WbGg9Hx-1.jpg"
            ],
            "size": "5",
            "l1_category": "",
            "l3_category": "27"
          },
          "brand": {
            "modified_on": 1655707988,
            "logo": "https://hdn-1.jiomarketx0.de/x0/brands/pictures/square-logo/original/DbhIvd_tB-Logo.jpeg",
            "brand_name": "Nike",
            "company": null,
            "created_on": 1647793418,
            "id": 4
          },
          "gst_details": {
            "gstin_code": null,
            "gst_tag": "IGST",
            "hsn_code": "62050000",
            "value_of_good": 475.24,
            "gst_tax_percentage": 5,
            "is_default_hsn_code": true,
            "brand_calculated_amount": 499,
            "gst_fee": "23.76"
          },
          "article": {
            "uid": "6237fdfec0903e7ae543c201",
            "identifiers": {
              "sku_code": "CL-001L-L-PRPL-PINK-5"
            },
            "return_config": {
              "time": 30,
              "unit": "days",
              "returnable": true
            }
          },
          "quantity": 1
        }
      ],
      "delivery_slot": {
        "slot": "By 03:00 AM",
        "upper_bound": "2022-06-21T03:42:23+00:00",
        "lower_bound": "2022-06-21T03:42:23+00:00",
        "date": "2022-06-21T03:42:23+00:00",
        "type": "order_window"
      },
      "total_items": 1,
      "payment_methods": [
        {
          "slug": "COD",
          "payment_id": "COD",
          "payment_amt": 549,
          "payment_cart": null,
          "payment_desc": "COD",
          "bdcustomer_id": null,
          "order_inv_num": null,
          "mode_of_payment": "COD",
          "payment_gateway_logo": null,
          "transaction_ref_number": ""
        }
      ],
      "vertical": "GROCERIES",
      "payments": {
        "mode": "COD",
        "logo": "https://hdn-1.fynd.com/payment/Pos+Logo.png",
        "source": "Jio Partner Pay"
      },
      "priority_text": null,
      "status": {
        "created_at": 1655804437,
        "shipment_id": "16557829457641286433",
        "status": "delivery_done",
        "bag_list": [
          "43880"
        ],
        "id": 19980
      },
      "prices": {
        "amount_paid": 549,
        "refund_amount": 549,
        "price_marked": 499,
        "cod_charges": 0,
        "discount": 0,
        "cashback_applied": 0,
        "delivery_charge": 50,
        "fynd_credits": 0,
        "cashback": 0,
        "price_effective": 499,
        "refund_credit": 0,
        "value_of_good": 475.24,
        "pm_price_split": {
          "COD": 549
        },
        "brand_calculated_amount": 499,
        "coupon_effective_discount": 0,
        "tax_collected_at_source": 0,
        "promotion_effective_discount": 0
      },
      "picked_date": "",
      "tracking_list": [
        {
          "status": "Order Placed",
          "time": "2022-06-21T09:12:32+00:00",
          "is_passed": true,
          "is_current": false
        },
        {
          "status": "Order Confirmed",
          "time": "2022-06-21T09:39:13+00:00",
          "is_passed": true,
          "is_current": false
        },
        {
          "status": "Invoiced",
          "time": "2022-06-21T09:40:12+00:00",
          "is_passed": true,
          "is_current": false
        },
        {
          "status": "Delivery Partner Assigned",
          "time": "2022-06-21T09:40:12+00:00",
          "is_passed": true,
          "is_current": false
        },
        {
          "status": "Packed",
          "time": "2022-06-21T09:40:12+00:00",
          "is_passed": true,
          "is_current": false
        },
        {
          "status": "In Transit",
          "time": "2022-06-21T09:40:12+00:00",
          "is_passed": true,
          "is_current": false
        },
        {
          "status": "Out For Delivery",
          "time": "2022-06-21T09:40:29+00:00",
          "is_passed": true,
          "is_current": false
        },
        {
          "status": "Delivered",
          "time": "2022-06-21T09:40:37+00:00",
          "is_passed": true,
          "is_current": true
        }
      ],
      "user_agent": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/102.0.0.0 Safari/537.36",
      "platform_logo": "https://fynd-static.s3.amazonaws.com/mode_of_payment/fynd_logo.png",
      "packaging_type": "POLYB_DFLT_L"
    }
  ]
}
```
</details>









---


### getShipmentList





```kotlin
client.orders.getShipmentList(lane: lane, searchType: searchType, searchId: searchId, fromDate: fromDate, toDate: toDate, dpIds: dpIds, orderingCompanyId: orderingCompanyId, stores: stores, salesChannel: salesChannel, requestByExt: requestByExt, pageNo: pageNo, pageSize: pageSize, customerId: customerId, isPrioritySort: isPrioritySort).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| lane | String? | no |  |   
| searchType | String? | no |  |   
| searchId | String? | no |  |   
| fromDate | String? | no |  |   
| toDate | String? | no |  |   
| dpIds | String? | no |  |   
| orderingCompanyId | String? | no |  |   
| stores | String? | no |  |   
| salesChannel | String? | no |  |   
| requestByExt | String? | no |  |   
| pageNo | Int? | no |  |   
| pageSize | Int? | no |  |   
| customerId | String? | no |  |   
| isPrioritySort | Boolean? | no |  |  





*Returned Response:*




[ShipmentInternalPlatformViewResponse](#ShipmentInternalPlatformViewResponse)

We are processing the report!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getShipmentToManifest





```kotlin
client.orders.getShipmentToManifest(groupEntity: groupEntity, salesChannel: salesChannel, dpIds: dpIds).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| groupEntity | String | yes |  |   
| salesChannel | String? | no |  |   
| dpIds | String? | no |  |  





*Returned Response:*




[ManifestShipmentResponse](#ManifestShipmentResponse)

We are processing the report!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getOrders





```kotlin
client.orders.getOrders(lane: lane, searchType: searchType, searchValue: searchValue, fromDate: fromDate, toDate: toDate, dpIds: dpIds, stores: stores, salesChannel: salesChannel, pageNo: pageNo, pageSize: pageSize, isPrioritySort: isPrioritySort).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| lane | String? | no |  |   
| searchType | String? | no |  |   
| searchValue | String? | no |  |   
| fromDate | String? | no |  |   
| toDate | String? | no |  |   
| dpIds | String? | no |  |   
| stores | String? | no |  |   
| salesChannel | String? | no |  |   
| pageNo | Int? | no |  |   
| pageSize | Int? | no |  |   
| isPrioritySort | Boolean? | no |  |  





*Returned Response:*




[OrderListingResponse](#OrderListingResponse)

We are processing the report!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getMetricCount





```kotlin
client.orders.getMetricCount(fromDate: fromDate, toDate: toDate).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| fromDate | String? | no |  |   
| toDate | String? | no |  |  





*Returned Response:*




[MetricCountResponse](#MetricCountResponse)

Response containing count of shipments of the given metrics




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getfilters





```kotlin
client.orders.getfilters(view: view).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| view | String | yes |  |  





*Returned Response:*




[FiltersResponse](#FiltersResponse)

List of filters




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "delivery_partners": [
    {
      "text": "Ecomm",
      "value": 1,
      "name": "ecom_jio"
    },
    {
      "text": "Grab",
      "value": 12,
      "name": "grab_jio"
    },
    {
      "text": "Ecomm Express",
      "value": 13,
      "name": "ecom_express_3P"
    },
    {
      "text": "Delivery Express",
      "value": 14,
      "name": "delhivery_express_3P"
    },
    {
      "text": "Xpressbees Express",
      "value": 15,
      "name": "xpressbees_express_3P"
    },
    {
      "text": "Delhiver Express",
      "value": 19,
      "name": "delhivery_jio_surface"
    }
  ],
  "channels": [
    {
      "text": "JIOMARKET",
      "value": "0000000000000000000000045",
      "name": "JIOMARKET"
    },
    {
      "text": "JIOMART",
      "value": "5ea6821b3425bb07c82a2551",
      "name": "JIOMART"
    }
  ]
}
```
</details>









---


### getApplicationShipments





```kotlin
client.application("<APPLICATION_ID>").orders.getApplicationShipments(lane: lane, searchType: searchType, searchId: searchId, fromDate: fromDate, toDate: toDate, dpIds: dpIds, orderingCompanyId: orderingCompanyId, stores: stores, salesChannel: salesChannel, requestByExt: requestByExt, pageNo: pageNo, pageSize: pageSize, customerId: customerId, isPrioritySort: isPrioritySort).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| lane | String? | no |  |   
| searchType | String? | no |  |   
| searchId | String? | no |  |   
| fromDate | String? | no |  |   
| toDate | String? | no |  |   
| dpIds | String? | no |  |   
| orderingCompanyId | String? | no |  |   
| stores | String? | no |  |   
| salesChannel | String? | no |  |   
| requestByExt | String? | no |  |   
| pageNo | Int? | no |  |   
| pageSize | Int? | no |  |   
| customerId | String? | no |  |   
| isPrioritySort | Boolean? | no |  |  





*Returned Response:*




[ShipmentInternalPlatformViewResponse](#ShipmentInternalPlatformViewResponse)

We are processing the report!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### createShipmentReport





```kotlin
client.orders.createShipmentReport(fromDate: fromDate, toDate: toDate).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| fromDate | String? | no |  |   
| toDate | String? | no |  |  





*Returned Response:*




[Success](#Success)

We have accepted report generation request.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getReportsShipmentListing





```kotlin
client.orders.getReportsShipmentListing(pageNo: pageNo, pageSize: pageSize).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| pageNo | Int? | no |  |   
| pageSize | Int? | no |  |  





*Returned Response:*




[OmsReports](#OmsReports)

We have are getting the info.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### upsertJioCode





```kotlin
client.orders.upsertJioCode(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [JioCodeUpsertPayload](#JioCodeUpsertPayload) | yes | Request body |




*Returned Response:*




[JioCodeUpsertResponse](#JioCodeUpsertResponse)

We are processing the report!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---



### Schemas

 
 
 #### [DPDetails](#DPDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country | String? |  yes  |  |
 | id | String? |  yes  |  |
 | name | String? |  yes  |  |
 | ewayBillId | String? |  yes  |  |
 | trackUrl | String? |  yes  |  |
 | pincode | String? |  yes  |  |
 | gstTag | String? |  yes  |  |
 | awbNo | String? |  yes  |  |

---


 
 
 #### [ShipmentStatusData](#ShipmentStatusData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | bagList | ArrayList<Int>? |  yes  |  |
 | id | Int? |  yes  |  |
 | status | String? |  yes  |  |
 | shipmentId | String? |  yes  |  |
 | createdAt | String? |  yes  |  |

---


 
 
 #### [TrackingList](#TrackingList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String |  no  |  |
 | isPassed | Boolean? |  yes  |  |
 | time | String? |  yes  |  |
 | isCurrent | Boolean? |  yes  |  |

---


 
 
 #### [GST](#GST)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | valueOfGood | Double |  no  |  |
 | brandCalculatedAmount | Double |  no  |  |
 | taxCollectedAtSource | Double |  no  |  |
 | gstFee | Double |  no  |  |
 | gstinCode | String |  no  |  |

---


 
 
 #### [Prices](#Prices)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cashback | Double |  no  |  |
 | priceMarked | Double |  no  |  |
 | refundAmount | Double |  no  |  |
 | valueOfGood | Double |  no  |  |
 | amountPaid | Double |  no  |  |
 | refundCredit | Double |  no  |  |
 | promotionEffectiveDiscount | Double |  no  |  |
 | cashbackApplied | Double |  no  |  |
 | deliveryCharge | Double |  no  |  |
 | discount | Double |  no  |  |
 | couponValue | Double |  no  |  |
 | taxCollectedAtSource | Double |  no  |  |
 | fyndCredits | Double |  no  |  |
 | amountPaidRoundoff | Double |  no  |  |
 | codCharges | Double |  no  |  |
 | priceEffective | Double |  no  |  |

---


 
 
 #### [UserDetailsData](#UserDetailsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country | String |  no  |  |
 | city | String |  no  |  |
 | state | String |  no  |  |
 | name | String |  no  |  |
 | phone | String |  no  |  |
 | pincode | String |  no  |  |
 | email | String |  no  |  |
 | address | String |  no  |  |

---


 
 
 #### [OrderDetailsData](#OrderDetailsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderingChannel | String? |  yes  |  |
 | source | String? |  yes  |  |
 | orderDate | String? |  yes  |  |
 | taxDetails | HashMap<String,Any>? |  yes  |  |
 | orderingChannelLogo | HashMap<String,Any>? |  yes  |  |
 | orderValue | String? |  yes  |  |
 | fyndOrderId | String |  no  |  |
 | codCharges | String? |  yes  |  |
 | affiliateId | String? |  yes  |  |

---


 
 
 #### [FulfillingStore](#FulfillingStore)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | country | String |  no  |  |
 | city | String |  no  |  |
 | state | String |  no  |  |
 | code | String |  no  |  |
 | id | String |  no  |  |
 | storeName | String |  no  |  |
 | contactPerson | String |  no  |  |
 | fulfillmentChannel | String |  no  |  |
 | phone | String |  no  |  |
 | pincode | String |  no  |  |
 | meta | HashMap<String,Any> |  no  |  |
 | address | String |  no  |  |

---


 
 
 #### [ShipmentPayments](#ShipmentPayments)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | logo | String? |  yes  |  |
 | mode | String |  no  |  |
 | source | String? |  yes  |  |

---


 
 
 #### [BagStatusHistory](#BagStatusHistory)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | String |  no  |  |
 | forward | Boolean? |  yes  |  |
 | appDisplayName | Boolean? |  yes  |  |
 | displayName | Boolean? |  yes  |  |
 | stateType | Boolean? |  yes  |  |
 | updatedAt | String? |  yes  |  |

---


 
 
 #### [OrderBagItem](#OrderBagItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | l3Category | Int |  no  |  |
 | size | String |  no  |  |
 | name | String |  no  |  |
 | slugKey | String |  no  |  |
 | brand | String |  no  |  |
 | l1Category | ArrayList<String>? |  yes  |  |
 | image | ArrayList<String>? |  yes  |  |

---


 
 
 #### [FinancialBreakup](#FinancialBreakup)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalUnits | Int |  no  |  |
 | cashbackApplied | Int |  no  |  |
 | couponValue | Int |  no  |  |
 | priceMarked | Int |  no  |  |
 | valueOfGood | Int |  no  |  |
 | identifiers | HashMap<String,Any> |  no  |  |
 | discount | Int |  no  |  |
 | gstTag | String |  no  |  |
 | gstTaxPercentage | Int |  no  |  |
 | pmPriceSplit | HashMap<String,Any> |  no  |  |
 | cashback | Int |  no  |  |
 | addedToFyndCash | Boolean |  no  |  |
 | amountPaid | Int |  no  |  |
 | hsnCode | String |  no  |  |
 | codCharges | Int |  no  |  |
 | size | String |  no  |  |
 | promotionEffectiveDiscount | Int |  no  |  |
 | refundCredit | Int |  no  |  |
 | transferPrice | Int |  no  |  |
 | deliveryCharge | Int |  no  |  |
 | brandCalculatedAmount | Int |  no  |  |
 | gstFee | String |  no  |  |
 | couponEffectiveDiscount | Int |  no  |  |
 | fyndCredits | Int |  no  |  |
 | itemName | String |  no  |  |
 | priceEffective | Int |  no  |  |

---


 
 
 #### [OrderBagArticle](#OrderBagArticle)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | returnConfig | HashMap<String,Any>? |  yes  |  |
 | uid | String? |  yes  |  |
 | identifiers | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [OrderBrandName](#OrderBrandName)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | brandName | String |  no  |  |
 | logo | String |  no  |  |
 | id | Int |  no  |  |
 | company | String |  no  |  |
 | modifiedOn | Int? |  yes  |  |
 | createdOn | Int |  no  |  |

---


 
 
 #### [BagGST](#BagGST)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | valueOfGood | Int? |  yes  |  |
 | hsnCode | String? |  yes  |  |
 | brandCalculatedAmount | Int? |  yes  |  |
 | gstFee | Int? |  yes  |  |
 | gstTag | String? |  yes  |  |
 | isDefaultHsnCode | Boolean? |  yes  |  |
 | gstinCode | String? |  yes  |  |
 | gstTaxPercentage | Int? |  yes  |  |

---


 
 
 #### [BagConfigs](#BagConfigs)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isActive | Boolean |  no  |  |
 | isCustomerReturnAllowed | Boolean |  no  |  |
 | canBeCancelled | Boolean |  no  |  |
 | enableTracking | Boolean |  no  |  |
 | allowForceReturn | Boolean |  no  |  |
 | isReturnable | Boolean |  no  |  |

---


 
 
 #### [OrderBags](#OrderBags)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | item | [OrderBagItem](#OrderBagItem)? |  yes  |  |
 | financialBreakup | ArrayList<[FinancialBreakup](#FinancialBreakup)>? |  yes  |  |
 | article | [OrderBagArticle](#OrderBagArticle)? |  yes  |  |
 | quantity | Int |  no  |  |
 | brand | [OrderBrandName](#OrderBrandName)? |  yes  |  |
 | entityType | String |  no  |  |
 | currentStatus | String |  no  |  |
 | bagId | Int |  no  |  |
 | gstDetails | [BagGST](#BagGST)? |  yes  |  |
 | bagConfigs | [BagConfigs](#BagConfigs)? |  yes  |  |
 | displayName | String |  no  |  |

---


 
 
 #### [ShipmentInfoResponse](#ShipmentInfoResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | priorityText | String? |  yes  |  |
 | goGreen | Boolean? |  yes  |  |
 | kiranaStoreId | String? |  yes  |  |
 | escalation | HashMap<String,Any>? |  yes  |  |
 | shipmentQuantity | Int |  no  |  |
 | dpDetails | [DPDetails](#DPDetails)? |  yes  |  |
 | lockStatus | String |  no  |  |
 | status | [ShipmentStatusData](#ShipmentStatusData)? |  yes  |  |
 | dueDate | String? |  yes  |  |
 | packagingType | String |  no  |  |
 | orderCreatedTime | String? |  yes  |  |
 | currentShipmentStatus | HashMap<String,Any> |  no  |  |
 | trackingList | ArrayList<[TrackingList](#TrackingList)>? |  yes  |  |
 | items | ArrayList<HashMap<String,Any>> |  no  |  |
 | gstDetails | [GST](#GST)? |  yes  |  |
 | prices | [Prices](#Prices)? |  yes  |  |
 | pickedDate | String |  no  |  |
 | trackingUrl | String |  no  |  |
 | statusProgress | Int |  no  |  |
 | securedDeliveryFlag | String? |  yes  |  |
 | isFyndStore | String? |  yes  |  |
 | beneficiaryDetails | Boolean? |  yes  |  |
 | invoice | HashMap<String,Any> |  no  |  |
 | coupon | HashMap<String,Any>? |  yes  |  |
 | orderStatus | HashMap<String,Any> |  no  |  |
 | canCancel | Boolean? |  yes  |  |
 | refundText | String? |  yes  |  |
 | userAgent | String |  no  |  |
 | replacementDetails | String? |  yes  |  |
 | deliveryStatus | ArrayList<HashMap<String,Any>> |  no  |  |
 | forwardShipmentStatus | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | deliveryDetails | [UserDetailsData](#UserDetailsData)? |  yes  |  |
 | enableDpTracking | String |  no  |  |
 | deliverySlot | HashMap<String,Any> |  no  |  |
 | creditNoteId | String |  no  |  |
 | affiliateShipmentId | String |  no  |  |
 | orderingStore | HashMap<String,Any> |  no  |  |
 | isPdsr | String? |  yes  |  |
 | childNodes | ArrayList<String>? |  yes  |  |
 | orderType | String |  no  |  |
 | refundDetails | HashMap<String,Any>? |  yes  |  |
 | payButton | String? |  yes  |  |
 | canBreak | String |  no  |  |
 | order | [OrderDetailsData](#OrderDetailsData)? |  yes  |  |
 | userInfo | HashMap<String,Any>? |  yes  |  |
 | canReturn | Boolean? |  yes  |  |
 | isNotFyndSource | Boolean |  no  |  |
 | isPackagingOrder | Boolean |  no  |  |
 | journeyType | String |  no  |  |
 | company | HashMap<String,Any> |  no  |  |
 | fyndstoreEmp | HashMap<String,Any> |  no  |  |
 | fulfillingStore | [FulfillingStore](#FulfillingStore)? |  yes  |  |
 | shipmentId | String |  no  |  |
 | paymentMode | String |  no  |  |
 | payments | [ShipmentPayments](#ShipmentPayments)? |  yes  |  |
 | enableTracking | Boolean? |  yes  |  |
 | billingDetails | [UserDetailsData](#UserDetailsData)? |  yes  |  |
 | mid | String? |  yes  |  |
 | forwardTrackingList | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | isInvoiced | Boolean |  no  |  |
 | forwardOrderStatus | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | platformLogo | Boolean |  no  |  |
 | isFyndCoupon | Boolean |  no  |  |
 | bagStatusHistory | ArrayList<[BagStatusHistory](#BagStatusHistory)>? |  yes  |  |
 | userId | String |  no  |  |
 | bags | [OrderBags](#OrderBags)? |  yes  |  |
 | emailId | String |  no  |  |
 | vertical | String? |  yes  |  |
 | totalItems | Int? |  yes  |  |
 | bankData | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [Error](#Error)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | reason | String? |  yes  |  |

---


 
 
 #### [SubLane](#SubLane)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | nextState | ArrayList<String>? |  yes  |  |
 | index | Int |  no  |  |
 | value | String |  no  |  |
 | currentState | ArrayList<String>? |  yes  |  |
 | totalShipments | Int |  no  |  |
 | text | String |  no  |  |

---


 
 
 #### [SuperLane](#SuperLane)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | options | ArrayList<[SubLane](#SubLane)>? |  yes  |  |
 | value | String |  no  |  |
 | text | String |  no  |  |

---


 
 
 #### [LaneConfigResponse](#LaneConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | superLanes | ArrayList<[SuperLane](#SuperLane)>? |  yes  |  |

---


 
 
 #### [Shipment](#Shipment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | priorityText | String? |  yes  |  |
 | shipmentQuantity | Int |  no  |  |
 | dpDetails | [DPDetails](#DPDetails)? |  yes  |  |
 | status | [ShipmentStatusData](#ShipmentStatusData)? |  yes  |  |
 | packagingType | String |  no  |  |
 | trackingList | ArrayList<[TrackingList](#TrackingList)>? |  yes  |  |
 | gstDetails | [GST](#GST)? |  yes  |  |
 | prices | [Prices](#Prices)? |  yes  |  |
 | pickedDate | String |  no  |  |
 | userAgent | String |  no  |  |
 | deliveryDetails | [UserDetailsData](#UserDetailsData)? |  yes  |  |
 | enableDpTracking | String |  no  |  |
 | deliverySlot | HashMap<String,Any> |  no  |  |
 | order | [OrderDetailsData](#OrderDetailsData)? |  yes  |  |
 | journeyType | String |  no  |  |
 | fulfillingStore | [FulfillingStore](#FulfillingStore)? |  yes  |  |
 | shipmentId | String |  no  |  |
 | paymentMode | String |  no  |  |
 | payments | [ShipmentPayments](#ShipmentPayments)? |  yes  |  |
 | billingDetails | [UserDetailsData](#UserDetailsData)? |  yes  |  |
 | platformLogo | String |  no  |  |
 | bagStatusHistory | ArrayList<[BagStatusHistory](#BagStatusHistory)>? |  yes  |  |
 | bags | [OrderBags](#OrderBags)? |  yes  |  |
 | vertical | String? |  yes  |  |
 | totalItems | Int? |  yes  |  |

---


 
 
 #### [OrderDict](#OrderDict)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipmentCount | Int |  no  |  |
 | orderDate | String |  no  |  |
 | fyndOrderId | String |  no  |  |

---


 
 
 #### [ShipmentDetailsResponse](#ShipmentDetailsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | shipments | ArrayList<[Shipment](#Shipment)>? |  yes  |  |
 | order | [OrderDict](#OrderDict)? |  yes  |  |

---


 
 
 #### [FilterInfoOption](#FilterInfoOption)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | String? |  yes  |  |
 | text | String |  no  |  |
 | name | String? |  yes  |  |

---


 
 
 #### [FiltersInfo](#FiltersInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | options | ArrayList<[FilterInfoOption](#FilterInfoOption)>? |  yes  |  |
 | type | String |  no  |  |
 | value | String |  no  |  |
 | text | String |  no  |  |

---


 
 
 #### [UserDataInfo](#UserDataInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isAnonymousUser | Boolean |  no  |  |
 | uid | Int |  no  |  |
 | gender | String |  no  |  |
 | mobile | String |  no  |  |
 | avisUserId | String |  no  |  |
 | lastName | String |  no  |  |
 | firstName | String |  no  |  |
 | email | String |  no  |  |

---


 
 
 #### [ShipmentStatus](#ShipmentStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String |  no  |  |
 | status | String |  no  |  |
 | hexCode | String |  no  |  |
 | opsStatus | String |  no  |  |
 | actualStatus | String |  no  |  |

---


 
 
 #### [Item](#Item)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | l3Category | Int |  no  |  |
 | canReturn | Boolean |  no  |  |
 | code | String |  no  |  |
 | size | String |  no  |  |
 | id | Int |  no  |  |
 | name | String |  no  |  |
 | departmentId | Int |  no  |  |
 | l1Category | ArrayList<String>? |  yes  |  |
 | color | String? |  yes  |  |
 | l3CategoryName | String |  no  |  |
 | image | ArrayList<String>? |  yes  |  |
 | canCancel | Boolean |  no  |  |

---


 
 
 #### [BagUnit](#BagUnit)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderingChannel | String |  no  |  |
 | item | [Item](#Item)? |  yes  |  |
 | totalShipmentBags | Int |  no  |  |
 | status | HashMap<String,Any> |  no  |  |
 | gst | [GST](#GST)? |  yes  |  |
 | itemQuantity | Int |  no  |  |
 | shipmentId | String |  no  |  |
 | bagId | Int |  no  |  |
 | prices | [Prices](#Prices)? |  yes  |  |

---


 
 
 #### [ShipmentItemFulFillingStore](#ShipmentItemFulFillingStore)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | String |  no  |  |
 | code | String |  no  |  |

---


 
 
 #### [PaymentModeInfo](#PaymentModeInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | logo | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [ShipmentItem](#ShipmentItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | channel | HashMap<String,Any>? |  yes  |  |
 | user | [UserDataInfo](#UserDataInfo)? |  yes  |  |
 | fulfillingCentre | String |  no  |  |
 | application | HashMap<String,Any>? |  yes  |  |
 | id | String |  no  |  |
 | shipmentStatus | [ShipmentStatus](#ShipmentStatus)? |  yes  |  |
 | totalBagsCount | Int |  no  |  |
 | shipmentCreatedAt | Int |  no  |  |
 | sla | HashMap<String,Any>? |  yes  |  |
 | bags | ArrayList<[BagUnit](#BagUnit)>? |  yes  |  |
 | fulfillingStore | [ShipmentItemFulFillingStore](#ShipmentItemFulFillingStore)? |  yes  |  |
 | prices | [Prices](#Prices)? |  yes  |  |
 | createdAt | String |  no  |  |
 | paymentModeInfo | [PaymentModeInfo](#PaymentModeInfo)? |  yes  |  |
 | totalShipmentsInOrder | Int |  no  |  |

---


 
 
 #### [ShipmentInternalPlatformViewResponse](#ShipmentInternalPlatformViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | HashMap<String,Any>? |  yes  |  |
 | filters | ArrayList<[FiltersInfo](#FiltersInfo)>? |  yes  |  |
 | items | ArrayList<[ShipmentItem](#ShipmentItem)>? |  yes  |  |
 | appliedFilters | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [ShipmentPricesDataSet](#ShipmentPricesDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cashback | Int? |  yes  |  |
 | priceMarked | Int? |  yes  |  |
 | valueOfGood | Int? |  yes  |  |
 | amountPaid | Int? |  yes  |  |
 | refundCredit | Int? |  yes  |  |
 | cashbackApplied | Int? |  yes  |  |
 | deliveryCharge | Int? |  yes  |  |
 | discount | String? |  yes  |  |
 | brandCalculatedAmount | Int? |  yes  |  |
 | gstFee | Int? |  yes  |  |
 | couponEffectiveDiscount | Int? |  yes  |  |
 | taxCollectedAtSource | Int? |  yes  |  |
 | fyndCredits | Int? |  yes  |  |
 | codCharges | Int? |  yes  |  |
 | priceEffective | Int? |  yes  |  |

---


 
 
 #### [Shipment1](#Shipment1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | rtdDone | String |  no  |  |
 | orderId | String |  no  |  |
 | shipmentStatus | String |  no  |  |
 | shipmentId | String |  no  |  |
 | totalItems | String |  no  |  |
 | prices | [ShipmentPricesDataSet](#ShipmentPricesDataSet)? |  yes  |  |

---


 
 
 #### [ManifestShipmentResponse](#ManifestShipmentResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | shipments | ArrayList<[Shipment1](#Shipment1)>? |  yes  |  |

---


 
 
 #### [ErrorSchemaDataSet](#ErrorSchemaDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | reason | String? |  yes  |  |

---


 
 
 #### [UserDataSet](#UserDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gender | String? |  yes  |  |
 | email | String? |  yes  |  |
 | mobile | Int |  no  |  |
 | name | String |  no  |  |

---


 
 
 #### [ShipmentPricesDataInfo](#ShipmentPricesDataInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cashback | Int? |  yes  |  |
 | priceMarked | Int? |  yes  |  |
 | refundAmount | Int? |  yes  |  |
 | valueOfGood | Int? |  yes  |  |
 | amountPaid | Int? |  yes  |  |
 | refundCredit | Int? |  yes  |  |
 | couponValue | String? |  yes  |  |
 | cashbackApplied | Int? |  yes  |  |
 | discount | Int? |  yes  |  |
 | deliveryCharge | Int? |  yes  |  |
 | fyndCredits | Int? |  yes  |  |
 | codCharges | Int? |  yes  |  |
 | priceEffective | Int? |  yes  |  |

---


 
 
 #### [ShipmentDataSet](#ShipmentDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | cashback | Int? |  yes  |  |
 | valueOfGood | Int? |  yes  |  |
 | shipmentImages | ArrayList<String>? |  yes  |  |
 | refundCredit | Int? |  yes  |  |
 | totalBags | Int |  no  |  |
 | shipmentStatus | HashMap<String,Any> |  no  |  |
 | cashbackApplied | Int? |  yes  |  |
 | deliveryCharge | Int? |  yes  |  |
 | brandCalculatedAmount | Int? |  yes  |  |
 | taxCollectedAtSource | Int? |  yes  |  |
 | couponEffectiveDiscount | Int? |  yes  |  |
 | shipmentId | String |  no  |  |
 | totalItems | Int |  no  |  |
 | fyndCredits | Int? |  yes  |  |
 | prices | [ShipmentPricesDataInfo](#ShipmentPricesDataInfo)? |  yes  |  |
 | priceEffective | Int? |  yes  |  |

---


 
 
 #### [OrderDataSet](#OrderDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderCreatedTime | String |  no  |  |
 | userInfo | [UserDataSet](#UserDataSet)? |  yes  |  |
 | orderId | String |  no  |  |
 | shipments | ArrayList<[ShipmentDataSet](#ShipmentDataSet)>? |  yes  |  |

---


 
 
 #### [OrderListingResponse](#OrderListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean |  no  |  |
 | orders | ArrayList<[OrderDataSet](#OrderDataSet)>? |  yes  |  |

---


 
 
 #### [OrderErrorSchemaDataSet](#OrderErrorSchemaDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | reason | String? |  yes  |  |

---


 
 
 #### [Options](#Options)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | Int? |  yes  |  |
 | text | String? |  yes  |  |

---


 
 
 #### [MetricsCount](#MetricsCount)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | options | ArrayList<[Options](#Options)>? |  yes  |  |
 | key | String |  no  |  |
 | value | Int |  no  |  |
 | text | String |  no  |  |

---


 
 
 #### [MetricCountResponse](#MetricCountResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[MetricsCount](#MetricsCount)>? |  yes  |  |

---


 
 
 #### [FiltersResponse](#FiltersResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | channels | ArrayList<[FiltersInfo](#FiltersInfo)>? |  yes  |  |
 | deliveryPartners | ArrayList<[FiltersInfo](#FiltersInfo)>? |  yes  |  |

---


 
 
 #### [Success](#Success)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [OmsReports](#OmsReports)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | reportId | String? |  yes  |  |
 | reportRequestedAt | String? |  yes  |  |
 | reportCreatedAt | String? |  yes  |  |
 | reportName | String? |  yes  |  |
 | s3Key | String? |  yes  |  |
 | status | String? |  yes  |  |
 | requestDetails | HashMap<String,Any>? |  yes  |  |
 | reportType | String? |  yes  |  |
 | displayName | String? |  yes  |  |

---


 
 
 #### [JioCodeUpsertDataSet](#JioCodeUpsertDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | itemId | String? |  yes  |  |
 | jioCode | String? |  yes  |  |
 | companyId | String? |  yes  |  |
 | articleId | String? |  yes  |  |

---


 
 
 #### [JioCodeUpsertPayload](#JioCodeUpsertPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | data | ArrayList<[JioCodeUpsertDataSet](#JioCodeUpsertDataSet)>? |  yes  |  |

---


 
 
 #### [NestedErrorSchemaDataSet](#NestedErrorSchemaDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | type | String? |  yes  |  |
 | value | String? |  yes  |  |

---


 
 
 #### [JioCodeUpsertResponse](#JioCodeUpsertResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | error | ArrayList<[NestedErrorSchemaDataSet](#NestedErrorSchemaDataSet)>? |  yes  |  |
 | data | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | success | Boolean? |  yes  |  |
 | traceId | String? |  yes  |  |
 | identifier | String? |  yes  |  |

---



