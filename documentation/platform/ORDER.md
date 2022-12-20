



##### [Back to Platform docs](./README.md)

## Order Methods
Handles all platform order and shipment api(s)
* [getShipments](#getshipments)
* [getShipmentById](#getshipmentbyid)
* [getOrderById](#getorderbyid)
* [getLaneConfig](#getlaneconfig)
* [getApplicationShipments](#getapplicationshipments)
* [getOrders](#getorders)
* [getMetricCount](#getmetriccount)
* [getAppOrderShipmentDetails](#getappordershipmentdetails)
* [trackPlatformShipment](#trackplatformshipment)
* [getfilters](#getfilters)
* [createShipmentReport](#createshipmentreport)
* [getReportsShipmentListing](#getreportsshipmentlisting)
* [upsertJioCode](#upsertjiocode)
* [getBulkInvoice](#getbulkinvoice)
* [getBulkInvoiceLabel](#getbulkinvoicelabel)
* [getBulkShipmentExcelFile](#getbulkshipmentexcelfile)
* [getBulkList](#getbulklist)
* [getManifestList](#getmanifestlist)
* [getManifestDetailsWithShipments](#getmanifestdetailswithshipments)
* [getBulkActionFailedReport](#getbulkactionfailedreport)
* [getShipmentReasons](#getshipmentreasons)
* [bulkActionProcessXlsxFile](#bulkactionprocessxlsxfile)
* [bulkActionDetails](#bulkactiondetails)
* [getBagById](#getbagbyid)
* [getBags](#getbags)
* [invalidateShipmentCache](#invalidateshipmentcache)
* [reassignLocation](#reassignlocation)
* [updateShipmentLock](#updateshipmentlock)
* [getAnnouncements](#getannouncements)
* [updateAddress](#updateaddress)
* [click2Call](#click2call)
* [updateShipmentStatus](#updateshipmentstatus)
* [processManifest](#processmanifest)
* [dispatchManifest](#dispatchmanifest)
* [getRoleBasedActions](#getrolebasedactions)
* [getShipmentHistory](#getshipmenthistory)
* [sendSmsNinja](#sendsmsninja)
* [platformManualAssignDPToShipment](#platformmanualassigndptoshipment)
* [updatePackagingDimensions](#updatepackagingdimensions)
* [createOrder](#createorder)
* [getChannelConfig](#getchannelconfig)
* [createChannelConfig](#createchannelconfig)
* [uploadConsent](#uploadconsent)
* [orderUpdate](#orderupdate)
* [checkOrderStatus](#checkorderstatus)



## Methods with example and description


### getShipments





```kotlin
client.order.getShipments(lane: lane, searchType: searchType, searchValue: searchValue, searchId: searchId, fromDate: fromDate, toDate: toDate, dpIds: dpIds, orderingCompanyId: orderingCompanyId, stores: stores, salesChannel: salesChannel, requestByExt: requestByExt, pageNo: pageNo, pageSize: pageSize, isPrioritySort: isPrioritySort, excludeLockedShipments: excludeLockedShipments, paymentMethods: paymentMethods, channelShipmentId: channelShipmentId, channelOrderId: channelOrderId, customMeta: customMeta).safeAwait{ response, error->
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
| isPrioritySort | Boolean? | no |  |   
| excludeLockedShipments | Boolean? | no |  |   
| paymentMethods | String? | no |  |   
| channelShipmentId | String? | no |  |   
| channelOrderId | String? | no |  |   
| customMeta | String? | no |  |  





*Returned Response:*




[ShipmentInternalPlatformViewResponse](#ShipmentInternalPlatformViewResponse)

We are processing the report!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getShipmentById





```kotlin
client.order.getShipmentById(channelShipmentId: channelShipmentId, shipmentId: shipmentId, orderingCompanyId: orderingCompanyId, requestByExt: requestByExt).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| channelShipmentId | String? | no |  |   
| shipmentId | String? | no |  |   
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


### getOrderById





```kotlin
client.order.getOrderById(orderId: orderId).safeAwait{ response, error->
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
    "fynd_order_id": "FY637CFCC00177713D47",
    "meta": {
      "files": [],
      "staff": {},
      "cart_id": 1835,
      "comment": "",
      "extra_meta": {},
      "order_tags": null,
      "order_type": "HomeDelivery",
      "employee_id": null,
      "payment_type": "self",
      "mongo_cart_id": 1835,
      "order_platform": "platform-site",
      "ordering_store": null,
      "order_child_entities": [
        "bag",
        "shipment"
      ]
    },
    "affiliate_id": "62f35968d101a6d38c886d85",
    "ordering_channel": "Ecomm",
    "source": "uniket-desktop",
    "tax_details": {
      "gstin": null
    },
    "order_date": "2022-11-22T22:15:53+00:00",
    "prices": {
      "amount_paid": 948.5,
      "refund_amount": 948.5,
      "price_marked": 1398,
      "cod_charges": 0,
      "discount": 349.5,
      "cashback_applied": 0,
      "delivery_charge": 0,
      "fynd_credits": 0,
      "cashback": 0,
      "price_effective": 1048.5,
      "refund_credit": 0,
      "value_of_good": 803.82,
      "coupon_value": 0,
      "tax_collected_at_source": 0,
      "promotion_effective_discount": 100,
      "amount_paid_roundoff": 948
    },
    "raw_user_agent": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.0.0 Safari/537.36",
    "comment": ""
  },
  "shipments": [
    {
      "shipment_id": "16691355532841431595",
      "fulfilling_store": {
        "id": 5,
        "code": "SF94",
        "fulfillment_channel": "pulse",
        "store_name": "RELIANCE RETAIL LTD - Beauty & Personal care",
        "contact_person": "Anju Abraham",
        "phone": "918898846722",
        "address": "store 1ST FLOOR, WEWORK VIJAY DIAMOND, CROSS RD B, AJIT NAGAR, KONDIVITA, ANDHERI EAST, MUMBAI, MAHARASHTR Mumbai Maharashtra 400093",
        "city": "Mumbai",
        "state": "Maharashtra",
        "country": "India",
        "pincode": "400093",
        "meta": {
          "stage": "verified",
          "timing": [
            {
              "open": true,
              "closing": {
                "hour": 22,
                "minute": 0
              },
              "opening": {
                "hour": 11,
                "minute": 0
              },
              "weekday": "monday"
            },
            {
              "open": true,
              "closing": {
                "hour": 22,
                "minute": 0
              },
              "opening": {
                "hour": 11,
                "minute": 0
              },
              "weekday": "tuesday"
            },
            {
              "open": true,
              "closing": {
                "hour": 22,
                "minute": 0
              },
              "opening": {
                "hour": 11,
                "minute": 0
              },
              "weekday": "wednesday"
            },
            {
              "open": true,
              "closing": {
                "hour": 22,
                "minute": 0
              },
              "opening": {
                "hour": 11,
                "minute": 0
              },
              "weekday": "thursday"
            },
            {
              "open": true,
              "closing": {
                "hour": 22,
                "minute": 0
              },
              "opening": {
                "hour": 11,
                "minute": 0
              },
              "weekday": "friday"
            },
            {
              "open": true,
              "closing": {
                "hour": 22,
                "minute": 0
              },
              "opening": {
                "hour": 11,
                "minute": 0
              },
              "weekday": "saturday"
            },
            {
              "open": true,
              "closing": {
                "hour": 22,
                "minute": 0
              },
              "opening": {
                "hour": 11,
                "minute": 0
              },
              "weekday": "sunday"
            }
          ],
          "documents": {},
          "gst_number": null,
          "display_name": "RELIANCE RETAIL LTD - Beauty & Personal care",
          "gst_credentials": {
            "e_invoice": {
              "enabled": false
            },
            "e_waybill": {
              "enabled": false
            }
          },
          "notification_emails": [
            "anjuabraham@gofynd.com"
          ],
          "product_return_config": {
            "on_same_store": true
          },
          "additional_contact_details": {
            "number": [
              "91 - 8898846722"
            ]
          },
          "ewaybill_portal_details": null
        },
        "fulfilment_type": null
      },
      "delivery_details": {
        "name": "Vaishakh Shetty",
        "email": "",
        "phone": "9892133001",
        "address": "home Asd,Mumbai,Maharashtra,Mumbai,Maharashtra,India Asd,Mumbai,Maharashtra,Mumbai,Maharashtra,India Mumbai,Maharashtra Mumbai Maharashtra 400083",
        "city": "Mumbai",
        "state": "Maharashtra",
        "country": "India",
        "pincode": "400083",
        "state_code": "27"
      },
      "billing_details": {
        "name": "Vaishakh Shetty",
        "email": "",
        "phone": "9892133001",
        "address": "home Asd,Mumbai,Maharashtra,Mumbai,Maharashtra,India Mumbai,Maharashtra Mumbai Maharashtra 400083",
        "city": "Mumbai",
        "state": "Maharashtra",
        "country": "India",
        "pincode": "400083",
        "state_code": "27"
      },
      "dp_details": {
        "id": null,
        "name": null,
        "awb_no": null,
        "eway_bill_id": null,
        "track_url": null,
        "gst_tag": "sgst",
        "dp_otp": ""
      },
      "journey_type": "forward",
      "order": {
        "fynd_order_id": "FY637CFCC00177713D47",
        "meta": {
          "files": [],
          "staff": {},
          "cart_id": 1835,
          "comment": "",
          "extra_meta": {},
          "order_tags": null,
          "order_type": "HomeDelivery",
          "employee_id": null,
          "payment_type": "self",
          "mongo_cart_id": 1835,
          "order_platform": "platform-site",
          "ordering_store": null,
          "order_child_entities": [
            "bag",
            "shipment"
          ]
        },
        "affiliate_id": "62f35968d101a6d38c886d85",
        "ordering_channel": "Ecomm",
        "source": "uniket-desktop",
        "tax_details": {
          "gstin": null
        },
        "order_date": "2022-11-22T22:15:53+00:00",
        "prices": {
          "amount_paid": 948.5,
          "refund_amount": 948.5,
          "price_marked": 1398,
          "cod_charges": 0,
          "discount": 349.5,
          "cashback_applied": 0,
          "delivery_charge": 0,
          "fynd_credits": 0,
          "cashback": 0,
          "price_effective": 1048.5,
          "refund_credit": 0,
          "value_of_good": 803.82,
          "coupon_value": 0,
          "tax_collected_at_source": 0,
          "promotion_effective_discount": 100,
          "amount_paid_roundoff": 948
        },
        "raw_user_agent": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.0.0 Safari/537.36",
        "comment": ""
      },
      "gst_details": {
        "value_of_good": 401.91,
        "gst_fee": 72.34,
        "brand_calculated_amount": 474.25,
        "tax_collected_at_source": 0,
        "gstin_code": "null"
      },
      "shipment_quantity": 1,
      "bag_status_history": [
        {
          "status": "pending",
          "updated_at": "2022-11-22T22:15:54+00:00",
          "state_type": "operational",
          "app_display_name": "Pending",
          "display_name": "Pending",
          "forward": null
        },
        {
          "status": "placed",
          "updated_at": "2022-11-22T22:15:59+00:00",
          "state_type": "operational",
          "app_display_name": "Ordered",
          "display_name": "Placed",
          "forward": null
        },
        {
          "status": "bag_confirmed",
          "updated_at": "2022-11-22T22:54:50+00:00",
          "state_type": "operational",
          "app_display_name": "Ordered",
          "display_name": "Bag Confirmed",
          "forward": null
        }
      ],
      "bags": [
        {
          "bag_id": 20472628,
          "display_name": "Bag",
          "entity_type": "bag",
          "meta": {
            "custom_message": "Please send the shipment as soon as possible."
          },
          "bag_configs": {
            "is_returnable": true,
            "can_be_cancelled": true,
            "enable_tracking": true,
            "is_customer_return_allowed": false,
            "is_active": true
          },
          "financial_breakup": [
            {
              "price_effective": 524.25,
              "discount": 174.75,
              "amount_paid": 474.25,
              "coupon_effective_discount": 0,
              "delivery_charge": 0,
              "fynd_credits": 0,
              "cod_charges": 0,
              "refund_credit": 0,
              "cashback": 0,
              "refund_amount": 474.25,
              "added_to_fynd_cash": false,
              "cashback_applied": 0,
              "gst_tax_percentage": 18,
              "value_of_good": 401.91,
              "price_marked": 699,
              "transfer_price": 0,
              "brand_calculated_amount": 474.25,
              "tax_collected_at_source": 0,
              "tcs_percentage": 0,
              "promotion_effective_discount": 50,
              "coupon_value": 0,
              "amount_paid_roundoff": 474,
              "size": "OS",
              "total_units": 1,
              "hsn_code": "20472574",
              "identifiers": {
                "ean": "6902395784364",
                "sku_code": "1020820"
              },
              "item_name": "L'Oreal Paris Rouge Signature Matte Liquid Lipstick, 146 I Enlight",
              "gst_fee": 72.34,
              "gst_tag": "SGST"
            }
          ],
          "current_status": "bag_confirmed",
          "item": {
            "name": "L'Oreal Paris Rouge Signature Matte Liquid Lipstick, 146 I Enlight",
            "brand": "L'Oreal Paris",
            "slug_key": "loreal-paris-rouge-signature-matte-liquid-lipstick-146-i-enlight-96a1wferol05",
            "images": [
              "https://cdn.pixelbin.io/v2/super-fire-62c344/tirabz/wrkr/tiraz0/products/pictures/item/free/270x0/1020820/shj00c0H4T-1020820_1.jpg",
              "https://cdn.pixelbin.io/v2/super-fire-62c344/tirabz/wrkr/tiraz0/products/pictures/item/free/270x0/1020820/iM7wvxxxT5-1020820_2.jpg",
              "https://cdn.pixelbin.io/v2/super-fire-62c344/tirabz/wrkr/tiraz0/products/pictures/item/free/270x0/1020820/TcPMevsr6O-1020820_3.jpg",
              "https://cdn.pixelbin.io/v2/super-fire-62c344/tirabz/wrkr/tiraz0/products/pictures/item/free/270x0/1020820/BAiV5xox57-1020820_4.jpg",
              "https://cdn.pixelbin.io/v2/super-fire-62c344/tirabz/wrkr/tiraz0/products/pictures/item/free/270x0/1020820/6wXPvugMto-1020820_5.jpg",
              "https://cdn.pixelbin.io/v2/super-fire-62c344/tirabz/wrkr/tiraz0/products/pictures/item/free/270x0/1020820/LvlirqfHho-1020820_6.jpg",
              "https://cdn.pixelbin.io/v2/super-fire-62c344/tirabz/wrkr/tiraz0/products/pictures/item/free/270x0/1020820/KKnZHIJwO-1020820_7.jpg",
              "https://cdn.pixelbin.io/v2/super-fire-62c344/tirabz/wrkr/tiraz0/products/pictures/item/free/270x0/1020820/NheQB3HLlq-1020820_8.jpg"
            ],
            "size": "OS",
            "l1_category": [
              "Makeup"
            ],
            "l3_category": 134
          },
          "brand": {
            "credit_note_expiry_days": null,
            "modified_on": "2022-11-22T09:08:25",
            "id": 2,
            "logo": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/tira-n/wrkr/tiraz0/brands/pictures/square-logo/original/iCMr3gmUF-Logo.jpeg",
            "created_on": "2022-08-09T13:17:41",
            "credit_note_allowed": false,
            "start_date": null,
            "company": null,
            "script_last_ran": null,
            "pickup_location": null,
            "brand_name": "L'Oreal Paris",
            "invoice_prefix": null,
            "is_virtual_invoice": false
          },
          "gst_details": {
            "gstin_code": "null",
            "gst_tag": "SGST",
            "hsn_code": "20472574",
            "value_of_good": 401.91,
            "gst_tax_percentage": 18,
            "is_default_hsn_code": true,
            "brand_calculated_amount": 474.25,
            "tax_collected_at_source": 0,
            "hsn_code_id": "62f3ad402cbb29a3a1c9186b",
            "gst_fee": 72.34,
            "igst_tax_percentage": 0,
            "sgst_tax_percentage": 9,
            "cgst_tax_percentage": 9,
            "igst_gst_fee": "0",
            "cgst_gst_fee": "36.17",
            "sgst_gst_fee": "36.17"
          },
          "article": {
            "uid": "62f495f2a604499934540c69",
            "identifiers": {
              "ean": "6902395784364",
              "sku_code": "1020820"
            },
            "return_config": {
              "time": 7,
              "unit": "days",
              "returnable": true
            }
          },
          "affiliate_bag_details": {
            "coupon_code": null
          },
          "quantity": 1,
          "identifier": null,
          "applied_promos": [
            {
              "amount": 50,
              "promo_id": "637cfcb19d43e76334b9fb6c",
              "buy_rules": [
                {
                  "item_criteria": {
                    "item_brand": [
                      2
                    ]
                  },
                  "cart_conditions": {}
                }
              ],
              "mrp_promotion": false,
              "discount_rules": [
                {
                  "type": "amount",
                  "value": 100
                }
              ],
              "promotion_name": "VS",
              "promotion_type": "amount",
              "article_quantity": 2
            }
          ],
          "mark_as_returnable": false
        }
      ],
      "custom_message": "Please send the shipment as soon as possible.",
      "company_id": 2,
      "user": {
        "user_oid": "637cbf77e7706fbc79baa669",
        "gender": "female",
        "first_name": "Vaishakh",
        "id": 18052704,
        "mobile": "9892133001",
        "mongo_user_id": "637cbf77e7706fbc79baa669",
        "email": "vaishakhshetty@gofynd.com",
        "last_name": "Shetty",
        "is_anonymous_user": false
      },
      "pickup_slot": {},
      "delivery_slot": {
        "slot": "By 16:00 PM",
        "upper_bound": "2022-11-25T16:45:50+00:00",
        "lower_bound": "2022-11-23T16:45:50+00:00",
        "date": "2022-11-25T16:45:50+00:00",
        "type": "order_window"
      },
      "total_items": 1,
      "payment_methods": {
        "PP": {
          "amount": 474.25,
          "mode": "PP",
          "name": "PartnerPay",
          "collect_by": "seller",
          "refund_by": "seller",
          "meta": {}
        }
      },
      "vertical": null,
      "priority_text": null,
      "status": {
        "created_at": "2022-11-22T22:54:50+00:00",
        "id": 88117778,
        "meta": {
          "request_meta": {},
          "state_manager_used": "entity",
          "kafka_emission_status": 1
        },
        "status": "bag_confirmed",
        "shipment_id": "16691355532841431595",
        "bag_list": [
          "20472628"
        ],
        "current_shipment_status": "bag_confirmed",
        "status_created_at": "2022-11-22T22:54:50"
      },
      "prices": {
        "amount_paid": 474.25,
        "refund_amount": 474.25,
        "price_marked": 699,
        "cod_charges": 0,
        "discount": 174.75,
        "cashback_applied": 0,
        "delivery_charge": 0,
        "fynd_credits": 0,
        "cashback": 0,
        "price_effective": 524.25,
        "refund_credit": 0,
        "value_of_good": 401.91,
        "coupon_value": 0,
        "tax_collected_at_source": 0,
        "promotion_effective_discount": 50,
        "amount_paid_roundoff": 474
      },
      "tracking_list": [
        {
          "text": "Placed",
          "status": "processing",
          "is_passed": true,
          "time": "2022-11-22T22:15:59+00:00"
        },
        {
          "text": "Bag Confirmed",
          "status": "confirmed",
          "is_passed": true,
          "time": "2022-11-22T22:54:50+00:00"
        },
        {
          "text": "Dp Assigned",
          "status": "dp_assigned",
          "is_passed": false,
          "time": ""
        },
        {
          "text": "In Transit",
          "status": "in_transit",
          "is_passed": false,
          "time": ""
        },
        {
          "text": "Out For Delivery",
          "status": "out_for_delivery",
          "is_passed": false,
          "time": ""
        },
        {
          "text": "Delivered",
          "status": "delivered",
          "is_passed": false,
          "time": ""
        }
      ],
      "user_agent": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/107.0.0.0 Safari/537.36",
      "platform_logo": "https://fynd-static.s3.amazonaws.com/mode_of_payment/ecomm_logo.png",
      "packaging_type": "POLYB_DFLT_L",
      "enable_dp_tracking": false,
      "invoice": {
        "updated_date": "1970-01-01T00:00:00",
        "store_invoice_id": null,
        "invoice_url": "",
        "label_url": "",
        "external_invoice_id": ""
      },
      "can_process": true,
      "estimated_sla_time": null,
      "tracking_url": "",
      "meta": {
        "dp_id": "9",
        "weight": 300,
        "external": {},
        "formatted": {
          "max": "Fri, 25 Nov",
          "min": "Wed, 23 Nov"
        },
        "timestamp": {
          "max": 1669394750,
          "min": 1669221950
        },
        "bag_weight": {
          "20472628": 300
        },
        "debug_info": {
          "stormbreaker_uuid": "998171bb-67af-412a-a00a-12d436418ff2"
        },
        "dp_options": {},
        "order_type": null,
        "dp_sort_key": "fm_priority",
        "packaging_name": "POLYB_DFLT_L",
        "assign_dp_from_sb": true,
        "same_store_available": true,
        "fulfill_virtual_invoice": false,
        "fulfilment_priority_text": null,
        "auto_trigger_dp_assignment_ACF": true
      },
      "shipment_created_at": "2022-11-22T22:15:53+00:00",
      "mark_as_returnable": false,
      "ordering_store": {
        "id": 5,
        "code": "SF94",
        "fulfillment_channel": "pulse",
        "store_name": "RELIANCE RETAIL LTD - Beauty & Personal care",
        "contact_person": "Anju Abraham",
        "phone": "918898846722",
        "address": "store 1ST FLOOR, WEWORK VIJAY DIAMOND, CROSS RD B, AJIT NAGAR, KONDIVITA, ANDHERI EAST, MUMBAI, MAHARASHTR Mumbai Maharashtra 400093",
        "city": "Mumbai",
        "state": "Maharashtra",
        "country": "India",
        "pincode": "400093",
        "meta": {
          "stage": "verified",
          "timing": [
            {
              "open": true,
              "closing": {
                "hour": 22,
                "minute": 0
              },
              "opening": {
                "hour": 11,
                "minute": 0
              },
              "weekday": "monday"
            },
            {
              "open": true,
              "closing": {
                "hour": 22,
                "minute": 0
              },
              "opening": {
                "hour": 11,
                "minute": 0
              },
              "weekday": "tuesday"
            },
            {
              "open": true,
              "closing": {
                "hour": 22,
                "minute": 0
              },
              "opening": {
                "hour": 11,
                "minute": 0
              },
              "weekday": "wednesday"
            },
            {
              "open": true,
              "closing": {
                "hour": 22,
                "minute": 0
              },
              "opening": {
                "hour": 11,
                "minute": 0
              },
              "weekday": "thursday"
            },
            {
              "open": true,
              "closing": {
                "hour": 22,
                "minute": 0
              },
              "opening": {
                "hour": 11,
                "minute": 0
              },
              "weekday": "friday"
            },
            {
              "open": true,
              "closing": {
                "hour": 22,
                "minute": 0
              },
              "opening": {
                "hour": 11,
                "minute": 0
              },
              "weekday": "saturday"
            },
            {
              "open": true,
              "closing": {
                "hour": 22,
                "minute": 0
              },
              "opening": {
                "hour": 11,
                "minute": 0
              },
              "weekday": "sunday"
            }
          ],
          "documents": {},
          "gst_number": null,
          "display_name": "RELIANCE RETAIL LTD - Beauty & Personal care",
          "gst_credentials": {
            "e_invoice": {
              "enabled": false
            },
            "e_waybill": {
              "enabled": false
            }
          },
          "notification_emails": [
            "anjuabraham@gofynd.com"
          ],
          "product_return_config": {
            "on_same_store": true
          },
          "additional_contact_details": {
            "number": [
              "91 - 8898846722"
            ]
          },
          "ewaybill_portal_details": null
        },
        "fulfilment_type": null
      },
      "custom_meta": {}
    }
  ]
}
```
</details>









---


### getLaneConfig





```kotlin
client.order.getLaneConfig(superLane: superLane, groupEntity: groupEntity, fromDate: fromDate, toDate: toDate, dpIds: dpIds, stores: stores, salesChannel: salesChannel, paymentMode: paymentMode, bagStatus: bagStatus).safeAwait{ response, error->
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
{
  "super_lanes": [
    {
      "text": "Unfulfilled",
      "value": "unfulfilled",
      "options": [
        {
          "text": "New",
          "value": "new",
          "total_items": 18,
          "index": 1,
          "actions": []
        },
        {
          "text": "Confirmed",
          "value": "confirmed",
          "total_items": 0,
          "index": 2,
          "actions": []
        },
        {
          "text": "To Be Packed",
          "value": "to_be_packed",
          "total_items": 0,
          "index": 3,
          "actions": []
        },
        {
          "text": "Ready To Dispatch",
          "value": "ready_for_dispatch",
          "total_items": 0,
          "index": 4,
          "actions": []
        }
      ],
      "total_items": 18
    },
    {
      "text": "Return",
      "value": "return",
      "options": [
        {
          "text": "Return Initiated",
          "value": "return_initiated",
          "total_items": 0,
          "index": 9,
          "actions": []
        },
        {
          "text": "Return In Transit",
          "value": "return_in_transit",
          "total_items": 0,
          "index": 10,
          "actions": []
        },
        {
          "text": "Return Delivered",
          "value": "return_delivered",
          "total_items": 0,
          "index": 11,
          "actions": []
        },
        {
          "text": "Return Accepted",
          "value": "return_accepted",
          "total_items": 0,
          "index": 12,
          "actions": []
        }
      ],
      "total_items": 0
    }
  ]
}
```
</details>









---


### getApplicationShipments





```kotlin
client.application("<APPLICATION_ID>").order.getApplicationShipments(lane: lane, searchType: searchType, searchId: searchId, fromDate: fromDate, toDate: toDate, dpIds: dpIds, orderingCompanyId: orderingCompanyId, stores: stores, salesChannel: salesChannel, requestByExt: requestByExt, pageNo: pageNo, pageSize: pageSize, customerId: customerId, isPrioritySort: isPrioritySort).safeAwait{ response, error->
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


### getOrders





```kotlin
client.order.getOrders(lane: lane, searchType: searchType, searchValue: searchValue, fromDate: fromDate, toDate: toDate, dpIds: dpIds, stores: stores, salesChannel: salesChannel, pageNo: pageNo, pageSize: pageSize, isPrioritySort: isPrioritySort, customMeta: customMeta).safeAwait{ response, error->
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
| customMeta | String? | no |  |  





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
client.order.getMetricCount(fromDate: fromDate, toDate: toDate).safeAwait{ response, error->
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


### getAppOrderShipmentDetails





```kotlin
client.application("<APPLICATION_ID>").order.getAppOrderShipmentDetails(orderId: orderId).safeAwait{ response, error->
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

We render shipment details.




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


### trackPlatformShipment
Track shipment




```kotlin
client.application("<APPLICATION_ID>").order.trackPlatformShipment(shipmentId: shipmentId).safeAwait{ response, error->
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



Track Shipment by shipment id, for application based on application Id

*Returned Response:*




[PlatformShipmentTrack](#PlatformShipmentTrack)

Success. Check the example shown below or refer `PlatformShipmentTrack` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "meta": {},
  "results": [
    {
      "updated_at": "24 Nov, 12:39 PM",
      "last_location_recieved_at": "Thane",
      "reason": "Fyndr",
      "shipment_type": "forward",
      "status": "dp_assigned",
      "updated_time": "2022-11-24T12:39:38+05:30",
      "account_name": "fyndr",
      "awb": "2125658183710",
      "raw_status": "dp_assigned",
      "meta": null
    }
  ]
}
```
</details>









---


### getfilters





```kotlin
client.order.getfilters(view: view, groupEntity: groupEntity).safeAwait{ response, error->
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
| groupEntity | String? | no |  |  





*Returned Response:*




[FiltersResponse](#FiltersResponse)

List of filters




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "global": [
    {
      "text": "Fulfilling Stores",
      "value": "stores",
      "type": "single_select",
      "options": null
    },
    {
      "text": "Search Types",
      "value": "search_type",
      "type": "single_select",
      "options": [
        {
          "text": "Auto",
          "value": "auto",
          "placeholder_text": "Search by Shipment ID, Order ID & Customer Email",
          "min_search_size": 5,
          "show_ui": true
        },
        {
          "text": "Shipment ID",
          "value": "shipment_id",
          "placeholder_text": "Search by Shipment ID",
          "min_search_size": 6,
          "show_ui": true
        },
        {
          "text": "Order ID",
          "value": "order_id",
          "placeholder_text": "Search by Order ID",
          "min_search_size": 6,
          "show_ui": true
        },
        {
          "text": "Customer Name",
          "value": "name",
          "placeholder_text": "Search by Customer Name",
          "min_search_size": 3,
          "show_ui": true
        },
        {
          "text": "Customer Email",
          "value": "email",
          "placeholder_text": "Search by Customer Email",
          "min_search_size": 5,
          "show_ui": true
        },
        {
          "text": "AWB Number",
          "value": "awb_no",
          "placeholder_text": "Search by AWB Number",
          "min_search_size": 10,
          "show_ui": true
        },
        {
          "text": "Invoice Id",
          "value": "invoice_id",
          "placeholder_text": "Search by Invoice Id",
          "min_search_size": 5,
          "show_ui": true
        },
        {
          "text": "EAN",
          "value": "ean",
          "placeholder_text": "Search by EAN",
          "min_search_size": 3,
          "show_ui": true
        },
        {
          "text": "SKU",
          "value": "sku",
          "placeholder_text": "Search by SKU",
          "min_search_size": 3,
          "show_ui": true
        }
      ]
    }
  ],
  "advance": {
    "Unfulfilled": [
      {
        "text": "Store Type",
        "value": "store_type",
        "type": "single_select",
        "options": [
          {
            "name": "Warehouse",
            "value": "warehouse"
          },
          {
            "name": "High Street",
            "value": "high_street"
          },
          {
            "name": "Mall",
            "value": "mall"
          },
          {
            "name": "Web Store",
            "value": "webstore"
          }
        ]
      },
      {
        "text": "Order Source",
        "value": "order_source",
        "type": "single_select",
        "options": [
          {
            "name": "Uniket",
            "value": "uniket"
          },
          {
            "name": "Fynd",
            "value": "fynd"
          },
          {
            "name": "Fynd Store",
            "value": "fynd_store"
          },
          {
            "name": "Affiliate",
            "value": "affiliate"
          }
        ]
      },
      {
        "text": "Time to Dispatch",
        "value": "time_to_dispatch",
        "type": "single_select",
        "options": [
          {
            "text": "Breached",
            "value": 1
          },
          {
            "text": "Not Breached",
            "value": -1
          }
        ]
      },
      {
        "text": "Payment Methods",
        "value": "payment_methods",
        "type": "single_select",
        "options": [
          {
            "text": "COD",
            "value": "COD"
          },
          {
            "text": "Prepaid",
            "value": "PREPAID"
          }
        ]
      }
    ],
    "Processed": [
      {
        "text": "Store Type",
        "value": "store_type",
        "type": "single_select",
        "options": [
          {
            "name": "Warehouse",
            "value": "warehouse"
          },
          {
            "name": "High Street",
            "value": "high_street"
          },
          {
            "name": "Mall",
            "value": "mall"
          },
          {
            "name": "Web Store",
            "value": "webstore"
          }
        ]
      },
      {
        "text": "Order Source",
        "value": "order_source",
        "type": "single_select",
        "options": [
          {
            "name": "Uniket",
            "value": "uniket"
          },
          {
            "name": "Fynd",
            "value": "fynd"
          },
          {
            "name": "Fynd Store",
            "value": "fynd_store"
          },
          {
            "name": "Affiliate",
            "value": "affiliate"
          }
        ]
      },
      {
        "text": "Payment Methods",
        "value": "payment_methods",
        "type": "single_select",
        "options": [
          {
            "text": "COD",
            "value": "COD"
          },
          {
            "text": "Prepaid",
            "value": "PREPAID"
          }
        ]
      }
    ],
    "Return": [
      {
        "text": "Store Type",
        "value": "store_type",
        "type": "single_select",
        "options": [
          {
            "name": "Warehouse",
            "value": "warehouse"
          },
          {
            "name": "High Street",
            "value": "high_street"
          },
          {
            "name": "Mall",
            "value": "mall"
          },
          {
            "name": "Web Store",
            "value": "webstore"
          }
        ]
      },
      {
        "text": "Order Source",
        "value": "order_source",
        "type": "single_select",
        "options": [
          {
            "name": "Uniket",
            "value": "uniket"
          },
          {
            "name": "Fynd",
            "value": "fynd"
          },
          {
            "name": "Fynd Store",
            "value": "fynd_store"
          },
          {
            "name": "Affiliate",
            "value": "affiliate"
          }
        ]
      },
      {
        "text": "Payment Methods",
        "value": "payment_methods",
        "type": "single_select",
        "options": [
          {
            "text": "COD",
            "value": "COD"
          },
          {
            "text": "Prepaid",
            "value": "PREPAID"
          }
        ]
      }
    ],
    "ActionCentre": [
      {
        "text": "Store Type",
        "value": "store_type",
        "type": "single_select",
        "options": [
          {
            "name": "Warehouse",
            "value": "warehouse"
          },
          {
            "name": "High Street",
            "value": "high_street"
          },
          {
            "name": "Mall",
            "value": "mall"
          },
          {
            "name": "Web Store",
            "value": "webstore"
          }
        ]
      },
      {
        "text": "Order Source",
        "value": "order_source",
        "type": "single_select",
        "options": [
          {
            "name": "Uniket",
            "value": "uniket"
          },
          {
            "name": "Fynd",
            "value": "fynd"
          },
          {
            "name": "Fynd Store",
            "value": "fynd_store"
          },
          {
            "name": "Affiliate",
            "value": "affiliate"
          }
        ]
      },
      {
        "text": "Payment Methods",
        "value": "payment_methods",
        "type": "single_select",
        "options": [
          {
            "text": "COD",
            "value": "COD"
          },
          {
            "text": "Prepaid",
            "value": "PREPAID"
          }
        ]
      }
    ]
  }
}
```
</details>









---


### createShipmentReport





```kotlin
client.order.createShipmentReport(fromDate: fromDate, toDate: toDate).safeAwait{ response, error->
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
client.order.getReportsShipmentListing(pageNo: pageNo, pageSize: pageSize).safeAwait{ response, error->
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
client.order.upsertJioCode(body: body).safeAwait{ response, error->
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


### getBulkInvoice





```kotlin
client.order.getBulkInvoice(batchId: batchId, docType: docType).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| batchId | String | yes |  |   
| docType | String | yes |  |  





*Returned Response:*




[BulkInvoicingResponse](#BulkInvoicingResponse)

We are processing the file!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getBulkInvoiceLabel





```kotlin
client.order.getBulkInvoiceLabel(batchId: batchId).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| batchId | String | yes |  |  





*Returned Response:*




[BulkInvoiceLabelResponse](#BulkInvoiceLabelResponse)

We are processing the file!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getBulkShipmentExcelFile





```kotlin
client.order.getBulkShipmentExcelFile(lane: lane, searchType: searchType, searchId: searchId, fromDate: fromDate, toDate: toDate, dpIds: dpIds, orderingCompanyId: orderingCompanyId, stores: stores, salesChannel: salesChannel, requestByExt: requestByExt, pageNo: pageNo, pageSize: pageSize, customerId: customerId, isPrioritySort: isPrioritySort).safeAwait{ response, error->
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




[FileResponse](#FileResponse)

We are processing the file!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "file_name": "placed_352_1668856953.7936668.xlsx",
  "operation": "putObject",
  "size": 13245,
  "namespace": "misc",
  "content_type": "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet",
  "file_path": "/misc/general/free/original/0Ex0-zTyw-placed_352_1668856953.7936668.xlsx",
  "method": "PUT",
  "tags": [],
  "upload": {
    "url": "https://fynd-staging-assets.s3-accelerate.amazonaws.com/x0/misc/general/free/original/0Ex0-zTyw-placed_352_1668856953.7936668.xlsx?Content-Type=application%2Fvnd.openxmlformats-officedocument.spreadsheetml.sheet&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAJUADR2WMPQT6ZJ2Q%2F20221119%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20221119T112233Z&X-Amz-Expires=1800&X-Amz-Signature=3408400dbe95ff12d0ea5487846aab74b0f2ae6963a58ac980fb46c11cd0b7be&X-Amz-SignedHeaders=host%3Bx-amz-acl&x-amz-acl=public-read",
    "expiry": 1800
  },
  "cdn": {
    "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/fyndnp/wrkr/x0/misc/general/free/original/0Ex0-zTyw-placed_352_1668856953.7936668.xlsx"
  }
}
```
</details>









---


### getBulkList





```kotlin
client.order.getBulkList(lane: lane, searchType: searchType, searchId: searchId, fromDate: fromDate, toDate: toDate, dpIds: dpIds, orderingCompanyId: orderingCompanyId, stores: stores, salesChannel: salesChannel, requestByExt: requestByExt, pageNo: pageNo, pageSize: pageSize, customerId: customerId, isPrioritySort: isPrioritySort).safeAwait{ response, error->
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




[BulkListingResponse](#BulkListingResponse)

We are processing the file!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{}
```
</details>









---


### getManifestList





```kotlin
client.order.getManifestList(status: status, storeId: storeId, pageNo: pageNo, pageSize: pageSize, searchValue: searchValue, fromDate: fromDate, toDate: toDate).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| status | String? | no |  |   
| storeId | Int? | no |  |   
| pageNo | Int? | no |  |   
| pageSize | Int? | no |  |   
| searchValue | String? | no |  |   
| fromDate | String? | no |  |   
| toDate | String? | no |  |  





*Returned Response:*




[GeneratedManifestResponse](#GeneratedManifestResponse)

We are processing the file!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "items": [
    {
      "is_active": true,
      "manifest_id": "5d1d753a-6af9-11ed-8b97-1a715b71f832",
      "company_id": 1,
      "created_at": "26-11-2022",
      "created_by": "nehashetye_gofynd_com_71847",
      "filters": {
        "lane": "ready_for_dispatch",
        "dp_ids": 30,
        "stores": 357,
        "dp_name": "Delhivery",
        "date_range": {
          "to_date": "18-11-2022",
          "from_date": "20-05-2022"
        },
        "store_name": "reliance",
        "sales_channels": "62186fce51e60369e2b093e6",
        "sales_channel_name": "fynd"
      },
      "status": "process"
    }
  ],
  "page": {
    "current": "1",
    "total": 1,
    "has_previous": false,
    "has_next": false,
    "type": "number",
    "size": "100"
  }
}
```
</details>









---


### getManifestDetailsWithShipments





```kotlin
client.order.getManifestDetailsWithShipments(manifestId: manifestId, fromDate: fromDate, toDate: toDate, storeId: storeId, page: page, pageSize: pageSize, lane: lane, dpIds: dpIds, searchType: searchType, searchValue: searchValue).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| manifestId | String | yes |  |   
| fromDate | String? | no |  |   
| toDate | String? | no |  |   
| storeId | Int | yes |  |   
| page | Int? | no |  |   
| pageSize | Int? | no |  |   
| lane | String? | no |  |   
| dpIds | Int? | no |  |   
| searchType | String? | no |  |   
| searchValue | String? | no |  |  





*Returned Response:*




[ManifestDetailResponse](#ManifestDetailResponse)

We are processing the file!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "manifest_details": [
    {
      "is_active": true,
      "manifest_id": "5d1d753a-6af9-11ed-8b97-1a715b71f832",
      "company_id": 1,
      "created_at": "26-11-2022",
      "created_by": "nehashetye_gofynd_com_71847",
      "filters": {
        "lane": "ready_for_dispatch",
        "dp_ids": 30,
        "stores": 357,
        "dp_name": "Delhivery",
        "date_range": {
          "to_date": "18-11-2022",
          "from_date": "20-05-2022"
        },
        "store_name": "reliance",
        "sales_channels": "62186fce51e60369e2b093e6",
        "sales_channel_name": "fynd"
      },
      "meta": {
        "filters": {
          "lane": "ready_for_dispatch",
          "dp_ids": 30,
          "stores": 357,
          "dp_name": "Delhivery",
          "date_range": {
            "to_date": "18-11-2022",
            "from_date": "20-05-2022"
          },
          "store_name": "reliance",
          "sales_channels": "62186fce51e60369e2b093e6",
          "sales_channel_name": "fynd"
        },
        "total_shipment_prices_count": {
          "total_price": 4792,
          "shipment_count": 8
        }
      },
      "status": "process",
      "uid": 11,
      "user_id": "5f23c85bf4439a812561443a",
      "id": "6381ca603a81bc8a08f340de"
    }
  ],
  "items": [
    {
      "shipment_id": "16631665711791409923",
      "order_id": "FYMP6321E86B01D585CA",
      "invoice_id": "1111111111111112",
      "awb": null,
      "item_qty": 1
    }
  ],
  "page": {
    "current": 1,
    "total": 1,
    "has_previous": false,
    "has_next": false,
    "type": "number",
    "size": 10
  },
  "additional_shipment_count": 0
}
```
</details>









---


### getBulkActionFailedReport





```kotlin
client.order.getBulkActionFailedReport(batchId: batchId, reportType: reportType).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| batchId | String | yes |  |   
| reportType | String? | no |  |  





*Returned Response:*




[FileResponse](#FileResponse)

File Processed!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "file_name": "requirements.txt",
  "operation": "putObject",
  "size": 8493,
  "namespace": "misc",
  "content_type": "text/plain",
  "file_path": "/misc/general/free/original/CEQ64hj8--requirements.txt",
  "method": "PUT",
  "tags": [],
  "upload": {
    "url": "https://fynd-staging-assets.s3-accelerate.amazonaws.com/x0/misc/general/free/original/CEQ64hj8--requirements.txt?Content-Type=text%2Fplain&X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=AKIAJUADR2WMPQT6ZJ2Q%2F20221118%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20221118T064720Z&X-Amz-Expires=1800&X-Amz-Signature=088ae87da27ef49644176f751ad2e642ab6cfad015cf01564ab5201c404000ec&X-Amz-SignedHeaders=host%3Bx-amz-acl&x-amz-acl=public-read",
    "expiry": 1800
  },
  "cdn": {
    "url": "https://cdn.pixelbin.io/v2/falling-surf-7c8bb8/fyndnp/wrkr/x0/misc/general/free/original/CEQ64hj8--requirements.txt"
  }
}
```
</details>









---


### getShipmentReasons
Get reasons behind full or partial cancellation of a shipment




```kotlin
client.order.getShipmentReasons(shipmentId: shipmentId, bagId: bagId, state: state).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| shipmentId | String | yes | ID of the shipment. An order may contain multiple items and may get divided into one or more shipment, each having its own ID. |   
| bagId | String | yes | ID of the bag. An order may contain multiple items and may get divided into one or more shipment, each having its own ID. |   
| state | String | yes | State for which reasons are required. |  



Use this API to retrieve the issues that led to the cancellation of bags within a shipment.

*Returned Response:*




[PlatformShipmentReasonsResponse](#PlatformShipmentReasonsResponse)

Success. Check the example shown below or refer `PlatformShipmentReasonsResponse` for more details.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true,
  "reasons": [
    {
      "id": 84,
      "display_name": "Not Available to accept the Order",
      "qc_type": [],
      "question_set": []
    },
    {
      "id": 85,
      "display_name": "Store Bulk Order",
      "qc_type": [],
      "question_set": []
    },
    {
      "id": 86,
      "display_name": "Cancelled due to delayed delivery",
      "qc_type": [],
      "question_set": []
    },
    {
      "id": 87,
      "display_name": "Others",
      "qc_type": [],
      "question_set": []
    }
  ]
}
```
</details>









---


### bulkActionProcessXlsxFile
emits uuid to kafka topic.




```kotlin
client.order.bulkActionProcessXlsxFile(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [BulkActionPayload](#BulkActionPayload) | yes | Request body |


Use this API to start processing Xlsx file.

*Returned Response:*




[BulkActionResponse](#BulkActionResponse)

Success to acknowledge the service was notified




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "status": true,
  "message": "Successful"
}
```
</details>









---


### bulkActionDetails
Returns failed, processing and successfully processed shipments.




```kotlin
client.order.bulkActionDetails(batchId: batchId).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| batchId | String | yes |  |  



Returns failed, processing and successfully processed shipments along with their counts and failed reasons.

*Returned Response:*




[BulkActionDetailsResponse](#BulkActionDetailsResponse)

Success to acknowledge the service was notified




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "success": true,
  "data": [
    {
      "batch_id": "d219af50-d37d-421b-b804-db2c51fa554a",
      "company_id": "1",
      "total_shipment_count": 1,
      "successful_shipment_ids": [],
      "successful_shipments_count": 0,
      "failed_shipments_count": 0,
      "processing_shipments_count": 1
    }
  ],
  "error": [],
  "message": "",
  "failed_records": [],
  "uploaded_by": "Neha Shetye",
  "user_id": "5f23c85bf4439a812561443a",
  "uploaded_on": "08 Nov 2022, 01:09 PM",
  "status": false
}
```
</details>









---


### getBagById





```kotlin
client.order.getBagById(bagId: bagId, channelBagId: channelBagId, channelId: channelId).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| bagId | String? | no |  |   
| channelBagId | String? | no |  |   
| channelId | String? | no |  |  





*Returned Response:*




[BagDetailsPlatformResponse](#BagDetailsPlatformResponse)

Successfully retrived shipment details!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getBags





```kotlin
client.order.getBags(bagIds: bagIds, shipmentIds: shipmentIds, orderIds: orderIds, channelBagIds: channelBagIds, channelShipmentIds: channelShipmentIds, channelOrderIds: channelOrderIds, channelId: channelId, pageNo: pageNo, pageSize: pageSize).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| bagIds | String? | no |  |   
| shipmentIds | String? | no |  |   
| orderIds | String? | no |  |   
| channelBagIds | String? | no |  |   
| channelShipmentIds | String? | no |  |   
| channelOrderIds | String? | no |  |   
| channelId | String? | no |  |   
| pageNo | Int? | no |  |   
| pageSize | Int? | no |  |  





*Returned Response:*




[GetBagsPlatformResponse](#GetBagsPlatformResponse)

Successfully retrived all the given shipments details!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### invalidateShipmentCache





```kotlin
client.order.invalidateShipmentCache(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [InvalidateShipmentCachePayload](#InvalidateShipmentCachePayload) | yes | Request body |


Invalidate shipment Cache

*Returned Response:*




[InvalidateShipmentCacheResponse](#InvalidateShipmentCacheResponse)

Successfully updated shipment cache!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### reassignLocation





```kotlin
client.order.reassignLocation(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [StoreReassign](#StoreReassign) | yes | Request body |


Reassign Location

*Returned Response:*




[StoreReassignResponse](#StoreReassignResponse)

Successfully reassigned location!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateShipmentLock





```kotlin
client.order.updateShipmentLock(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [UpdateShipmentLockPayload](#UpdateShipmentLockPayload) | yes | Request body |


update shipment lock

*Returned Response:*




[UpdateShipmentLockResponse](#UpdateShipmentLockResponse)

Successfully updated shipment cache!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getAnnouncements





```kotlin
client.order.getAnnouncements(date: date).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| date | String? | no |  |  





*Returned Response:*




[AnnouncementsResponse](#AnnouncementsResponse)

Announcements retrieved successfully




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateAddress





```kotlin
client.order.updateAddress(shipmentId: shipmentId, name: name, address: address, addressType: addressType, pincode: pincode, phone: phone, email: email, landmark: landmark, addressCategory: addressCategory, city: city, state: state, country: country).safeAwait{ response, error->
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
| name | String? | no |  |   
| address | String? | no |  |   
| addressType | String? | no |  |   
| pincode | String? | no |  |   
| phone | String? | no |  |   
| email | String? | no |  |   
| landmark | String? | no |  |   
| addressCategory | String | yes |  |   
| city | String? | no |  |   
| state | String? | no |  |   
| country | String? | no |  |  





*Returned Response:*




[BaseResponse](#BaseResponse)

Update Address will be processed!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### click2Call





```kotlin
client.order.click2Call(caller: caller, receiver: receiver, bagId: bagId, callingTo: callingTo, callerId: callerId).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| caller | String | yes |  |   
| receiver | String | yes |  |   
| bagId | String | yes |  |   
| callingTo | String? | no |  |   
| callerId | String? | no |  |  





*Returned Response:*




[Click2CallResponse](#Click2CallResponse)

Process call on request!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updateShipmentStatus





```kotlin
client.order.updateShipmentStatus(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [UpdateShipmentStatusRequest](#UpdateShipmentStatusRequest) | yes | Request body |


Update shipment status

*Returned Response:*




[UpdateShipmentStatusResponseBody](#UpdateShipmentStatusResponseBody)

Successfully reassigned location!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### processManifest





```kotlin
client.order.processManifest(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [CreateOrderPayload](#CreateOrderPayload) | yes | Request body |




*Returned Response:*




[CreateOrderResponse](#CreateOrderResponse)

Manifest will be processed!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### dispatchManifest





```kotlin
client.order.dispatchManifest(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [DispatchManifest](#DispatchManifest) | yes | Request body |




*Returned Response:*




[SuccessResponse](#SuccessResponse)

Shipment Dispatched mapped with manifest!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getRoleBasedActions





```kotlin
client.order.getRoleBasedActions().safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```








*Returned Response:*




[GetActionsResponse](#GetActionsResponse)

You will get an array of actions allowed for that particular user based on their role




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getShipmentHistory





```kotlin
client.order.getShipmentHistory(shipmentId: shipmentId, bagId: bagId).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- | 
| shipmentId | Int? | no |  |   
| bagId | Int? | no |  |  





*Returned Response:*




[ShipmentHistoryResponse](#ShipmentHistoryResponse)

It shows the journey of the shipment!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "activity_history": [
    {
      "message": {
        "message": "Bag status changed to pending",
        "store_id": 10,
        "store_code": "SF94",
        "store_name": "shub",
        "reason": {},
        "type": "activity_status"
      },
      "createdat": "01 Apr 2022, 17:57:PM",
      "user": "system",
      "type": "activity_status",
      "l1_detail": null,
      "l2_detail": null,
      "l3_detail": null,
      "ticket_id": null,
      "ticket_url": null
    },
    {
      "message": {
        "message": "Bag status changed to placed",
        "store_id": 10,
        "store_code": "SF94",
        "store_name": "shub",
        "reason": {},
        "type": "activity_status"
      },
      "createdat": "01 Apr 2022, 17:57:PM",
      "user": "system",
      "type": "activity_status",
      "l1_detail": null,
      "l2_detail": null,
      "l3_detail": null,
      "ticket_id": null,
      "ticket_url": null
    }
  ]
}
```
</details>









---


### sendSmsNinja





```kotlin
client.order.sendSmsNinja(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [SendSmsPayload](#SendSmsPayload) | yes | Request body |




*Returned Response:*




[OrderStatusResult](#OrderStatusResult)

Sms Sent successfully




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### platformManualAssignDPToShipment





```kotlin
client.order.platformManualAssignDPToShipment(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [ManualAssignDPToShipment](#ManualAssignDPToShipment) | yes | Request body |




*Returned Response:*




[ManualAssignDPToShipmentResponse](#ManualAssignDPToShipmentResponse)

DP Assigned for the given shipment Ids.




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### updatePackagingDimensions





```kotlin
client.order.updatePackagingDimensions(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [CreateOrderPayload](#CreateOrderPayload) | yes | Request body |




*Returned Response:*




[CreateOrderResponse](#CreateOrderResponse)

Manifest will be processed!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### createOrder





```kotlin
client.order.createOrder(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [CreateOrderAPI](#CreateOrderAPI) | yes | Request body |




*Returned Response:*




[CreateOrderResponse](#CreateOrderResponse)

Successfully created an order!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### getChannelConfig





```kotlin
client.order.getChannelConfig().safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```






getChannelConfig

*Returned Response:*




[CreateChannelConfigData](#CreateChannelConfigData)

Successfully created the config data




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "config_data": {
    "payment_info": {
      "payment_methods": [
        {
          "mode": "COD",
          "collect_by": "gringotts",
          "refund_by": "gringotts"
        }
      ],
      "source": "fynd",
      "mode_of_payment": "COD"
    },
    "dp_configuration": {
      "shipping_by": "fynd"
    },
    "logo_url": {},
    "location_reassignment": false,
    "lock_states": [
      "bag_packed"
    ],
    "shipment_assignment": "16703096324891701814"
  }
}
```
</details>









---


### createChannelConfig





```kotlin
client.order.createChannelConfig(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [CreateChannelConfigData](#CreateChannelConfigData) | yes | Request body |


createChannelConfig

*Returned Response:*




[CreateChannelConfigResponse](#CreateChannelConfigResponse)

Successfully updateShipmentStatus!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json
{
  "data": {
    "acknowledged": true,
    "is_upserted": false,
    "is_inserted": false
  }
}
```
</details>









---


### uploadConsent





```kotlin
client.order.uploadConsent(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [UploadConsent](#UploadConsent) | yes | Request body |




*Returned Response:*




[SuccessResponse](#SuccessResponse)

Successful Manifest upload!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### orderUpdate





```kotlin
client.order.orderUpdate(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [PlatformOrderUpdate](#PlatformOrderUpdate) | yes | Request body |




*Returned Response:*




[ResponseDetail](#ResponseDetail)

We are processing the order!




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---


### checkOrderStatus





```kotlin
client.order.checkOrderStatus(body: body).safeAwait{ response, error->
    response?.let{
      // Use response
    } ->
    error?.let{
      
    } 
}
```





| Argument  |  Type  | Required | Description |
| --------- | -----  | -------- | ----------- |
| body | [OrderStatus](#OrderStatus) | yes | Request body |




*Returned Response:*




[OrderStatusResult](#OrderStatusResult)

Order Status retrieved successfully




<details>
<summary><i>&nbsp; Example:</i></summary>

```json

```
</details>









---



### Schemas

 
 
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
 | value | String |  no  |  |
 | text | String |  no  |  |
 | type | String |  no  |  |
 | options | ArrayList<[FilterInfoOption](#FilterInfoOption)>? |  yes  |  |

---


 
 
 #### [ShipmentStatus](#ShipmentStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | title | String |  no  |  |
 | hexCode | String |  no  |  |
 | status | String |  no  |  |
 | actualStatus | String |  no  |  |
 | opsStatus | String |  no  |  |

---


 
 
 #### [PlatformItem](#PlatformItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | departmentId | Int? |  yes  |  |
 | canReturn | Boolean? |  yes  |  |
 | id | Int? |  yes  |  |
 | l3CategoryName | String? |  yes  |  |
 | name | String? |  yes  |  |
 | canCancel | Boolean? |  yes  |  |
 | image | ArrayList<String>? |  yes  |  |
 | code | String? |  yes  |  |
 | l1Category | ArrayList<String>? |  yes  |  |
 | size | String? |  yes  |  |
 | color | String? |  yes  |  |
 | l3Category | Int? |  yes  |  |
 | images | ArrayList<String>? |  yes  |  |

---


 
 
 #### [GSTDetailsData](#GSTDetailsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gstinCode | String |  no  |  |
 | taxCollectedAtSource | Double |  no  |  |
 | brandCalculatedAmount | Double |  no  |  |
 | valueOfGood | Double |  no  |  |
 | gstFee | Double |  no  |  |

---


 
 
 #### [Prices](#Prices)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | amountPaid | Double? |  yes  |  |
 | codCharges | Double? |  yes  |  |
 | couponValue | Double? |  yes  |  |
 | cashbackApplied | Double? |  yes  |  |
 | refundAmount | Double? |  yes  |  |
 | priceEffective | Double? |  yes  |  |
 | refundCredit | Double? |  yes  |  |
 | amountPaidRoundoff | Double? |  yes  |  |
 | promotionEffectiveDiscount | Double? |  yes  |  |
 | deliveryCharge | Double? |  yes  |  |
 | taxCollectedAtSource | Double? |  yes  |  |
 | fyndCredits | Double? |  yes  |  |
 | cashback | Double? |  yes  |  |
 | valueOfGood | Double? |  yes  |  |
 | discount | Double? |  yes  |  |
 | priceMarked | Double? |  yes  |  |

---


 
 
 #### [BagUnit](#BagUnit)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | item | [PlatformItem](#PlatformItem)? |  yes  |  |
 | gst | [GSTDetailsData](#GSTDetailsData)? |  yes  |  |
 | shipmentId | String |  no  |  |
 | orderingChannel | String |  no  |  |
 | canReturn | Boolean? |  yes  |  |
 | itemQuantity | Int |  no  |  |
 | canCancel | Boolean? |  yes  |  |
 | status | HashMap<String,Any> |  no  |  |
 | totalShipmentBags | Int |  no  |  |
 | bagId | Int |  no  |  |
 | prices | [Prices](#Prices)? |  yes  |  |

---


 
 
 #### [ShipmentItemFulFillingStore](#ShipmentItemFulFillingStore)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | code | String |  no  |  |
 | id | String |  no  |  |

---


 
 
 #### [PaymentModeInfo](#PaymentModeInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | logo | String |  no  |  |
 | type | String |  no  |  |

---


 
 
 #### [UserDataInfo](#UserDataInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | mobile | String? |  yes  |  |
 | firstName | String? |  yes  |  |
 | isAnonymousUser | Boolean? |  yes  |  |
 | avisUserId | String? |  yes  |  |
 | name | String? |  yes  |  |
 | email | String? |  yes  |  |
 | lastName | String? |  yes  |  |
 | uid | Int? |  yes  |  |
 | gender | String? |  yes  |  |

---


 
 
 #### [ShipmentItem](#ShipmentItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipmentStatus | [ShipmentStatus](#ShipmentStatus)? |  yes  |  |
 | bags | ArrayList<[BagUnit](#BagUnit)>? |  yes  |  |
 | shipmentCreatedAt | Int |  no  |  |
 | application | HashMap<String,Any>? |  yes  |  |
 | createdAt | String |  no  |  |
 | fulfillingStore | [ShipmentItemFulFillingStore](#ShipmentItemFulFillingStore)? |  yes  |  |
 | fulfillingCentre | String |  no  |  |
 | paymentModeInfo | [PaymentModeInfo](#PaymentModeInfo)? |  yes  |  |
 | id | String |  no  |  |
 | sla | HashMap<String,Any>? |  yes  |  |
 | totalShipmentsInOrder | Int |  no  |  |
 | channel | HashMap<String,Any>? |  yes  |  |
 | paymentMethods | HashMap<String,Any>? |  yes  |  |
 | totalBagsCount | Int |  no  |  |
 | user | [UserDataInfo](#UserDataInfo)? |  yes  |  |
 | prices | [Prices](#Prices)? |  yes  |  |

---


 
 
 #### [ShipmentInternalPlatformViewResponse](#ShipmentInternalPlatformViewResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | HashMap<String,Any>? |  yes  |  |
 | filters | ArrayList<[FiltersInfo](#FiltersInfo)>? |  yes  |  |
 | appliedFilters | HashMap<String,Any>? |  yes  |  |
 | items | ArrayList<[ShipmentItem](#ShipmentItem)>? |  yes  |  |

---


 
 
 #### [Error](#Error)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [DPDetailsData](#DPDetailsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gstTag | String? |  yes  |  |
 | pincode | String? |  yes  |  |
 | id | String? |  yes  |  |
 | awbNo | String? |  yes  |  |
 | name | String? |  yes  |  |
 | ewayBillId | String? |  yes  |  |
 | trackUrl | String? |  yes  |  |
 | country | String? |  yes  |  |

---


 
 
 #### [TrackingList](#TrackingList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | time | String? |  yes  |  |
 | isCurrent | Boolean? |  yes  |  |
 | status | String |  no  |  |
 | isPassed | Boolean? |  yes  |  |
 | text | String |  no  |  |

---


 
 
 #### [ShipmentPayments](#ShipmentPayments)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | logo | String? |  yes  |  |
 | mode | String |  no  |  |
 | source | String? |  yes  |  |

---


 
 
 #### [FulfillingStore](#FulfillingStore)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | city | String |  no  |  |
 | phone | String |  no  |  |
 | state | String |  no  |  |
 | fulfillmentChannel | String |  no  |  |
 | id | String |  no  |  |
 | contactPerson | String |  no  |  |
 | address | String |  no  |  |
 | storeName | String |  no  |  |
 | meta | HashMap<String,Any> |  no  |  |
 | code | String |  no  |  |
 | pincode | String |  no  |  |
 | country | String |  no  |  |

---


 
 
 #### [ShipmentStatusData](#ShipmentStatusData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | bagList | ArrayList<Int>? |  yes  |  |
 | shipmentId | String? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | id | Int? |  yes  |  |
 | status | String? |  yes  |  |

---


 
 
 #### [OrderDetailsData](#OrderDetailsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | codCharges | String? |  yes  |  |
 | taxDetails | HashMap<String,Any>? |  yes  |  |
 | orderValue | String? |  yes  |  |
 | orderingChannel | String? |  yes  |  |
 | fyndOrderId | String |  no  |  |
 | orderingChannelLogo | HashMap<String,Any>? |  yes  |  |
 | orderDate | String? |  yes  |  |
 | source | String? |  yes  |  |
 | affiliateId | String? |  yes  |  |

---


 
 
 #### [PlatformDeliveryAddress](#PlatformDeliveryAddress)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | city | String? |  yes  |  |
 | addressType | String? |  yes  |  |
 | phone | String? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | area | String? |  yes  |  |
 | state | String? |  yes  |  |
 | address2 | String? |  yes  |  |
 | longitude | Int? |  yes  |  |
 | version | String? |  yes  |  |
 | email | String? |  yes  |  |
 | contactPerson | String? |  yes  |  |
 | latitude | Int? |  yes  |  |
 | address1 | String? |  yes  |  |
 | pincode | String? |  yes  |  |
 | landmark | String? |  yes  |  |
 | addressCategory | String? |  yes  |  |
 | country | String? |  yes  |  |
 | updatedAt | String? |  yes  |  |

---


 
 
 #### [BagConfigs](#BagConfigs)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enableTracking | Boolean |  no  |  |
 | isCustomerReturnAllowed | Boolean |  no  |  |
 | allowForceReturn | Boolean |  no  |  |
 | canBeCancelled | Boolean |  no  |  |
 | isReturnable | Boolean |  no  |  |
 | isActive | Boolean |  no  |  |

---


 
 
 #### [BagGST](#BagGST)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gstTaxPercentage | Int? |  yes  |  |
 | hsnCode | String? |  yes  |  |
 | gstTag | String? |  yes  |  |
 | gstinCode | String? |  yes  |  |
 | isDefaultHsnCode | Boolean? |  yes  |  |
 | brandCalculatedAmount | Int? |  yes  |  |
 | valueOfGood | Int? |  yes  |  |
 | gstFee | Int? |  yes  |  |

---


 
 
 #### [DiscountRules](#DiscountRules)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | Int? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [ItemCriterias](#ItemCriterias)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | itemBrand | ArrayList<Int>? |  yes  |  |

---


 
 
 #### [BuyRules](#BuyRules)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | itemCriteria | [ItemCriterias](#ItemCriterias)? |  yes  |  |
 | cartConditions | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [AppliedPromos](#AppliedPromos)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | promotionType | String? |  yes  |  |
 | discountRules | ArrayList<[DiscountRules](#DiscountRules)>? |  yes  |  |
 | buyRules | ArrayList<[BuyRules](#BuyRules)>? |  yes  |  |
 | articleQuantity | Int? |  yes  |  |
 | promoId | String? |  yes  |  |
 | promotionName | String? |  yes  |  |
 | amount | Double? |  yes  |  |
 | mrpPromotion | Boolean? |  yes  |  |

---


 
 
 #### [OrderBagArticle](#OrderBagArticle)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | returnConfig | HashMap<String,Any>? |  yes  |  |
 | identifiers | HashMap<String,Any>? |  yes  |  |
 | uid | String? |  yes  |  |

---


 
 
 #### [OrderBrandName](#OrderBrandName)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | modifiedOn | Int? |  yes  |  |
 | company | String |  no  |  |
 | createdOn | Int |  no  |  |
 | brandName | String |  no  |  |
 | id | Int |  no  |  |
 | logo | String |  no  |  |

---


 
 
 #### [Identifier](#Identifier)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | ean | String? |  yes  |  |

---


 
 
 #### [FinancialBreakup](#FinancialBreakup)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | codCharges | Int |  no  |  |
 | amountPaidRoundoff | Int? |  yes  |  |
 | totalUnits | Int |  no  |  |
 | itemName | String |  no  |  |
 | cashback | Int |  no  |  |
 | identifiers | [Identifier](#Identifier) |  no  |  |
 | amountPaid | Int |  no  |  |
 | couponValue | Int |  no  |  |
 | gstTaxPercentage | Int |  no  |  |
 | deliveryCharge | Int |  no  |  |
 | addedToFyndCash | Boolean |  no  |  |
 | fyndCredits | Int |  no  |  |
 | promotionEffectiveDiscount | Int |  no  |  |
 | brandCalculatedAmount | Int |  no  |  |
 | size | String |  no  |  |
 | couponEffectiveDiscount | Int |  no  |  |
 | valueOfGood | Int |  no  |  |
 | cashbackApplied | Int |  no  |  |
 | transferPrice | Int |  no  |  |
 | gstTag | String |  no  |  |
 | gstFee | String |  no  |  |
 | refundCredit | Int |  no  |  |
 | priceEffective | Int |  no  |  |
 | pmPriceSplit | HashMap<String,Any> |  no  |  |
 | hsnCode | String |  no  |  |
 | taxCollectedAtSource | Int? |  yes  |  |
 | discount | Int |  no  |  |
 | priceMarked | Int |  no  |  |

---


 
 
 #### [OrderBags](#OrderBags)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | displayName | String? |  yes  |  |
 | quantity | Int? |  yes  |  |
 | parentPromoBags | HashMap<String,Any>? |  yes  |  |
 | deliveryAddress | [PlatformDeliveryAddress](#PlatformDeliveryAddress)? |  yes  |  |
 | currentStatus | String? |  yes  |  |
 | bagConfigs | [BagConfigs](#BagConfigs)? |  yes  |  |
 | gstDetails | [BagGST](#BagGST)? |  yes  |  |
 | item | [PlatformItem](#PlatformItem)? |  yes  |  |
 | identifier | String? |  yes  |  |
 | sellerIdentifier | String? |  yes  |  |
 | entityType | String? |  yes  |  |
 | appliedPromos | ArrayList<[AppliedPromos](#AppliedPromos)>? |  yes  |  |
 | article | [OrderBagArticle](#OrderBagArticle)? |  yes  |  |
 | prices | [Prices](#Prices)? |  yes  |  |
 | canReturn | Boolean? |  yes  |  |
 | canCancel | Boolean? |  yes  |  |
 | brand | [OrderBrandName](#OrderBrandName)? |  yes  |  |
 | financialBreakup | ArrayList<[FinancialBreakup](#FinancialBreakup)>? |  yes  |  |
 | lineNumber | Int? |  yes  |  |
 | bagId | Int |  no  |  |

---


 
 
 #### [UserDetailsData](#UserDetailsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | city | String |  no  |  |
 | phone | String |  no  |  |
 | state | String |  no  |  |
 | address | String |  no  |  |
 | name | String |  no  |  |
 | email | String |  no  |  |
 | pincode | String |  no  |  |
 | country | String |  no  |  |

---


 
 
 #### [BagStateMapper](#BagStateMapper)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | appStateName | String? |  yes  |  |
 | stateType | String |  no  |  |
 | displayName | String |  no  |  |
 | notifyCustomer | Boolean? |  yes  |  |
 | appDisplayName | String? |  yes  |  |
 | journeyType | String |  no  |  |
 | name | String |  no  |  |
 | bsId | Int |  no  |  |
 | appFacing | Boolean? |  yes  |  |
 | isActive | Boolean? |  yes  |  |

---


 
 
 #### [BagStatusHistory](#BagStatusHistory)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | storeId | Int |  no  |  |
 | stateType | String? |  yes  |  |
 | displayName | Boolean? |  yes  |  |
 | shipmentId | String |  no  |  |
 | bshId | Int |  no  |  |
 | stateId | Int |  no  |  |
 | createdAt | String |  no  |  |
 | forward | Boolean? |  yes  |  |
 | deliveryAwbNumber | String? |  yes  |  |
 | appDisplayName | Boolean? |  yes  |  |
 | status | String |  no  |  |
 | bagId | Int |  no  |  |
 | bagStateMapper | [BagStateMapper](#BagStateMapper) |  no  |  |
 | kafkaSync | Boolean? |  yes  |  |
 | deliveryPartnerId | Int? |  yes  |  |
 | updatedAt | String? |  yes  |  |
 | reasons | ArrayList<HashMap<String,Any>>? |  yes  |  |

---


 
 
 #### [ShipmentInfoResponse](#ShipmentInfoResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderingStore | HashMap<String,Any> |  no  |  |
 | isInvoiced | Boolean |  no  |  |
 | isFyndStore | String? |  yes  |  |
 | shipmentQuantity | Int? |  yes  |  |
 | shipmentImages | ArrayList<String>? |  yes  |  |
 | affiliateShipmentId | String |  no  |  |
 | company | HashMap<String,Any> |  no  |  |
 | totalItems | Int? |  yes  |  |
 | orderStatus | HashMap<String,Any> |  no  |  |
 | dpDetails | [DPDetailsData](#DPDetailsData)? |  yes  |  |
 | trackingList | ArrayList<[TrackingList](#TrackingList)>? |  yes  |  |
 | payButton | String? |  yes  |  |
 | coupon | HashMap<String,Any>? |  yes  |  |
 | orderType | String |  no  |  |
 | currentShipmentStatus | HashMap<String,Any> |  no  |  |
 | forwardTrackingList | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | fyndstoreEmp | HashMap<String,Any> |  no  |  |
 | gstDetails | [GSTDetailsData](#GSTDetailsData)? |  yes  |  |
 | payments | [ShipmentPayments](#ShipmentPayments)? |  yes  |  |
 | items | ArrayList<HashMap<String,Any>> |  no  |  |
 | deliverySlot | HashMap<String,Any>? |  yes  |  |
 | userId | String |  no  |  |
 | enableDpTracking | String? |  yes  |  |
 | forwardShipmentStatus | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | fulfillingStore | [FulfillingStore](#FulfillingStore)? |  yes  |  |
 | invoice | HashMap<String,Any> |  no  |  |
 | canBreak | String |  no  |  |
 | isFyndCoupon | Boolean |  no  |  |
 | childNodes | ArrayList<String>? |  yes  |  |
 | isPdsr | String? |  yes  |  |
 | refundText | String? |  yes  |  |
 | status | [ShipmentStatusData](#ShipmentStatusData)? |  yes  |  |
 | orderCreatedTime | String? |  yes  |  |
 | refundDetails | HashMap<String,Any>? |  yes  |  |
 | paymentMode | String? |  yes  |  |
 | order | [OrderDetailsData](#OrderDetailsData)? |  yes  |  |
 | priorityText | String? |  yes  |  |
 | trackingUrl | String |  no  |  |
 | creditNoteId | String |  no  |  |
 | shipmentStatus | String? |  yes  |  |
 | dueDate | String? |  yes  |  |
 | enableTracking | Boolean? |  yes  |  |
 | statusProgress | Int |  no  |  |
 | bags | ArrayList<[OrderBags](#OrderBags)>? |  yes  |  |
 | kiranaStoreId | String? |  yes  |  |
 | isPackagingOrder | Boolean |  no  |  |
 | operationalStatus | String? |  yes  |  |
 | isNotFyndSource | Boolean |  no  |  |
 | emailId | String |  no  |  |
 | mid | String? |  yes  |  |
 | journeyType | String? |  yes  |  |
 | forwardOrderStatus | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | prices | [Prices](#Prices)? |  yes  |  |
 | vertical | String? |  yes  |  |
 | beneficiaryDetails | Boolean? |  yes  |  |
 | securedDeliveryFlag | String? |  yes  |  |
 | deliveryDetails | [UserDetailsData](#UserDetailsData)? |  yes  |  |
 | shipmentId | String |  no  |  |
 | billingDetails | [UserDetailsData](#UserDetailsData)? |  yes  |  |
 | platformLogo | Boolean |  no  |  |
 | pickedDate | String? |  yes  |  |
 | canReturn | Boolean? |  yes  |  |
 | bankData | HashMap<String,Any>? |  yes  |  |
 | escalation | HashMap<String,Any>? |  yes  |  |
 | goGreen | Boolean? |  yes  |  |
 | userInfo | HashMap<String,Any>? |  yes  |  |
 | packagingType | String? |  yes  |  |
 | lockStatus | String |  no  |  |
 | canCancel | Boolean? |  yes  |  |
 | replacementDetails | String? |  yes  |  |
 | bagStatusHistory | ArrayList<[BagStatusHistory](#BagStatusHistory)>? |  yes  |  |
 | customMeta | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | userAgent | String? |  yes  |  |
 | deliveryStatus | ArrayList<HashMap<String,Any>> |  no  |  |
 | totalBags | Int? |  yes  |  |

---


 
 
 #### [OrderDict](#OrderDict)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipmentCount | Int |  no  |  |
 | orderDate | String |  no  |  |
 | fyndOrderId | String |  no  |  |

---


 
 
 #### [PlatformShipment](#PlatformShipment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipmentQuantity | Int? |  yes  |  |
 | shipmentImages | ArrayList<String>? |  yes  |  |
 | totalItems | Int? |  yes  |  |
 | dpDetails | [DPDetailsData](#DPDetailsData)? |  yes  |  |
 | trackingList | ArrayList<[TrackingList](#TrackingList)>? |  yes  |  |
 | gstDetails | [GSTDetailsData](#GSTDetailsData)? |  yes  |  |
 | payments | [ShipmentPayments](#ShipmentPayments)? |  yes  |  |
 | deliverySlot | HashMap<String,Any>? |  yes  |  |
 | enableDpTracking | String? |  yes  |  |
 | fulfillingStore | [FulfillingStore](#FulfillingStore)? |  yes  |  |
 | status | [ShipmentStatusData](#ShipmentStatusData)? |  yes  |  |
 | paymentMode | String? |  yes  |  |
 | order | [OrderDetailsData](#OrderDetailsData)? |  yes  |  |
 | priorityText | String? |  yes  |  |
 | shipmentStatus | String? |  yes  |  |
 | bags | ArrayList<[OrderBags](#OrderBags)>? |  yes  |  |
 | operationalStatus | String? |  yes  |  |
 | journeyType | String? |  yes  |  |
 | prices | [Prices](#Prices)? |  yes  |  |
 | vertical | String? |  yes  |  |
 | deliveryDetails | [UserDetailsData](#UserDetailsData)? |  yes  |  |
 | shipmentId | String |  no  |  |
 | billingDetails | [UserDetailsData](#UserDetailsData)? |  yes  |  |
 | platformLogo | String? |  yes  |  |
 | pickedDate | String? |  yes  |  |
 | packagingType | String? |  yes  |  |
 | bagStatusHistory | ArrayList<[BagStatusHistory](#BagStatusHistory)>? |  yes  |  |
 | customMeta | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | userAgent | String? |  yes  |  |
 | totalBags | Int? |  yes  |  |

---


 
 
 #### [ShipmentDetailsResponse](#ShipmentDetailsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | customMeta | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | order | [OrderDict](#OrderDict)? |  yes  |  |
 | shipments | ArrayList<[PlatformShipment](#PlatformShipment)>? |  yes  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [SubLane](#SubLane)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalItems | Int? |  yes  |  |
 | actions | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | value | String? |  yes  |  |
 | text | String? |  yes  |  |
 | index | Int? |  yes  |  |

---


 
 
 #### [SuperLane](#SuperLane)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | value | String |  no  |  |
 | totalItems | Int? |  yes  |  |
 | text | String |  no  |  |
 | options | ArrayList<[SubLane](#SubLane)>? |  yes  |  |

---


 
 
 #### [LaneConfigResponse](#LaneConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | superLanes | ArrayList<[SuperLane](#SuperLane)>? |  yes  |  |

---


 
 
 #### [Page](#Page)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  |  |
 | hasNext | Boolean? |  yes  |  |
 | current | Int? |  yes  |  |
 | hasPrevious | Boolean? |  yes  |  |
 | size | Int? |  yes  |  |
 | total | Int? |  yes  |  |

---


 
 
 #### [PlatformBreakupValues](#PlatformBreakupValues)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | value | String? |  yes  |  |
 | display | String? |  yes  |  |

---


 
 
 #### [PlatformChannel](#PlatformChannel)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String? |  yes  |  |
 | logo | String? |  yes  |  |

---


 
 
 #### [PlatformOrderItems](#PlatformOrderItems)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderId | String? |  yes  |  |
 | breakupValues | ArrayList<[PlatformBreakupValues](#PlatformBreakupValues)>? |  yes  |  |
 | orderValue | Double? |  yes  |  |
 | shipments | ArrayList<[PlatformShipment](#PlatformShipment)>? |  yes  |  |
 | totalOrderValue | Double? |  yes  |  |
 | channel | [PlatformChannel](#PlatformChannel)? |  yes  |  |
 | userInfo | [UserDataInfo](#UserDataInfo)? |  yes  |  |
 | meta | HashMap<String,Any>? |  yes  |  |
 | orderCreatedTime | String? |  yes  |  |
 | paymentMode | String? |  yes  |  |

---


 
 
 #### [OrderListingResponse](#OrderListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page](#Page)? |  yes  |  |
 | success | Boolean? |  yes  |  |
 | lane | String? |  yes  |  |
 | totalCount | Int? |  yes  |  |
 | message | String? |  yes  |  |
 | items | ArrayList<[PlatformOrderItems](#PlatformOrderItems)>? |  yes  |  |

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
 | value | Int |  no  |  |
 | key | String |  no  |  |
 | text | String |  no  |  |
 | options | ArrayList<[Options](#Options)>? |  yes  |  |

---


 
 
 #### [MetricCountResponse](#MetricCountResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | items | ArrayList<[MetricsCount](#MetricsCount)>? |  yes  |  |

---


 
 
 #### [PlatformTrack](#PlatformTrack)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | lastLocationRecievedAt | String? |  yes  |  |
 | updatedTime | String? |  yes  |  |
 | shipmentType | String? |  yes  |  |
 | accountName | String? |  yes  |  |
 | awb | String? |  yes  |  |
 | rawStatus | String? |  yes  |  |
 | status | String? |  yes  |  |
 | reason | String? |  yes  |  |
 | meta | HashMap<String,Any>? |  yes  |  |
 | updatedAt | String? |  yes  |  |

---


 
 
 #### [PlatformShipmentTrack](#PlatformShipmentTrack)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | meta | HashMap<String,Any>? |  yes  |  |
 | results | ArrayList<[PlatformTrack](#PlatformTrack)>? |  yes  |  |

---


 
 
 #### [FiltersResponse](#FiltersResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | advance | ArrayList<HashMap<String,Any>>? |  yes  |  |

---


 
 
 #### [Success](#Success)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [OmsReports](#OmsReports)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | reportCreatedAt | String? |  yes  |  |
 | displayName | String? |  yes  |  |
 | requestDetails | HashMap<String,Any>? |  yes  |  |
 | reportRequestedAt | String? |  yes  |  |
 | status | String? |  yes  |  |
 | s3Key | String? |  yes  |  |
 | reportId | String? |  yes  |  |
 | reportName | String? |  yes  |  |
 | reportType | String? |  yes  |  |

---


 
 
 #### [JioCodeUpsertDataSet](#JioCodeUpsertDataSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | itemId | String? |  yes  |  |
 | companyId | String? |  yes  |  |
 | articleId | String? |  yes  |  |
 | jioCode | String? |  yes  |  |

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
 | value | String? |  yes  |  |
 | type | String? |  yes  |  |

---


 
 
 #### [JioCodeUpsertResponse](#JioCodeUpsertResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | traceId | String? |  yes  |  |
 | identifier | String? |  yes  |  |
 | error | ArrayList<[NestedErrorSchemaDataSet](#NestedErrorSchemaDataSet)>? |  yes  |  |
 | success | Boolean? |  yes  |  |
 | data | ArrayList<HashMap<String,Any>>? |  yes  |  |

---


 
 
 #### [BulkInvoicingResponse](#BulkInvoicingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [BulkInvoiceLabelResponse](#BulkInvoiceLabelResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | label | HashMap<String,Any>? |  yes  |  |
 | companyId | String? |  yes  |  |
 | storeId | String? |  yes  |  |
 | batchId | String |  no  |  |
 | invoiceStatus | String? |  yes  |  |
 | invoice | HashMap<String,Any>? |  yes  |  |
 | storeName | String? |  yes  |  |
 | doInvoiceLabelGenerated | Boolean |  no  |  |
 | data | HashMap<String,Any>? |  yes  |  |
 | storeCode | String? |  yes  |  |

---


 
 
 #### [FileUploadResponse](#FileUploadResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | url | String? |  yes  |  |
 | expiry | Int? |  yes  |  |

---


 
 
 #### [URL](#URL)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | url | String? |  yes  |  |

---


 
 
 #### [FileResponse](#FileResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tags | ArrayList<String>? |  yes  |  |
 | upload | [FileUploadResponse](#FileUploadResponse)? |  yes  |  |
 | operation | String? |  yes  |  |
 | namespace | String? |  yes  |  |
 | fileName | String? |  yes  |  |
 | method | String? |  yes  |  |
 | size | Int? |  yes  |  |
 | filePath | String? |  yes  |  |
 | cdn | [URL](#URL)? |  yes  |  |
 | contentType | String? |  yes  |  |

---


 
 
 #### [BulkListingPage](#BulkListingPage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  |  |
 | hasNext | Boolean? |  yes  |  |
 | current | Int? |  yes  |  |
 | hasPrevious | Boolean? |  yes  |  |
 | size | Int? |  yes  |  |
 | total | Int? |  yes  |  |

---


 
 
 #### [bulkListingData](#bulkListingData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | successfulShipments | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | failedShipments | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | userName | String? |  yes  |  |
 | storeCode | String? |  yes  |  |
 | excelUrl | String? |  yes  |  |
 | processingShipments | ArrayList<String>? |  yes  |  |
 | userId | String? |  yes  |  |
 | companyId | Int? |  yes  |  |
 | storeId | Int? |  yes  |  |
 | fileName | String? |  yes  |  |
 | status | String? |  yes  |  |
 | uploadedOn | String? |  yes  |  |
 | processing | Int? |  yes  |  |
 | failed | Int? |  yes  |  |
 | total | Int? |  yes  |  |
 | batchId | String? |  yes  |  |
 | id | String? |  yes  |  |
 | storeName | String? |  yes  |  |
 | successful | Int? |  yes  |  |

---


 
 
 #### [BulkListingResponse](#BulkListingResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [BulkListingPage](#BulkListingPage)? |  yes  |  |
 | success | Boolean? |  yes  |  |
 | data | ArrayList<[bulkListingData](#bulkListingData)>? |  yes  |  |
 | error | String? |  yes  |  |

---


 
 
 #### [ManifestPage](#ManifestPage)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | type | String? |  yes  |  |
 | hasNext | Boolean? |  yes  |  |
 | current | String? |  yes  |  |
 | hasPrevious | Boolean? |  yes  |  |
 | size | String? |  yes  |  |
 | total | Int? |  yes  |  |

---


 
 
 #### [DateRange](#DateRange)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fromDate | String? |  yes  |  |
 | toDate | String? |  yes  |  |

---


 
 
 #### [ManifestFilter](#ManifestFilter)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | dpName | String? |  yes  |  |
 | dateRange | [DateRange](#DateRange)? |  yes  |  |
 | dpIds | String? |  yes  |  |
 | salesChannelName | String? |  yes  |  |
 | storeName | String? |  yes  |  |
 | lane | String? |  yes  |  |
 | salesChannels | String? |  yes  |  |
 | stores | String? |  yes  |  |

---


 
 
 #### [GeneratedManifestItem](#GeneratedManifestItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | companyId | Int? |  yes  |  |
 | manifestId | String? |  yes  |  |
 | filters | [ManifestFilter](#ManifestFilter)? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | status | String? |  yes  |  |
 | createdBy | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |

---


 
 
 #### [GeneratedManifestResponse](#GeneratedManifestResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [ManifestPage](#ManifestPage)? |  yes  |  |
 | items | ArrayList<[GeneratedManifestItem](#GeneratedManifestItem)>? |  yes  |  |

---


 
 
 #### [ManifestDetailTotalShipmentPricesCount](#ManifestDetailTotalShipmentPricesCount)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipmentCount | Int? |  yes  |  |
 | totalPrice | Double? |  yes  |  |

---


 
 
 #### [ManifestDetailMeta](#ManifestDetailMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filters | [ManifestFilter](#ManifestFilter)? |  yes  |  |
 | totalShipmentPricesCount | [ManifestDetailTotalShipmentPricesCount](#ManifestDetailTotalShipmentPricesCount)? |  yes  |  |

---


 
 
 #### [ManifestDetail](#ManifestDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | userId | Int? |  yes  |  |
 | companyId | Int? |  yes  |  |
 | manifestId | String? |  yes  |  |
 | filters | [ManifestFilter](#ManifestFilter)? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | id | Int? |  yes  |  |
 | meta | [ManifestDetailMeta](#ManifestDetailMeta)? |  yes  |  |
 | status | String? |  yes  |  |
 | uid | Int? |  yes  |  |
 | createdBy | String? |  yes  |  |
 | isActive | Boolean? |  yes  |  |

---


 
 
 #### [ManifestDetailItem](#ManifestDetailItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderId | String? |  yes  |  |
 | awb | String? |  yes  |  |
 | shipmentId | String? |  yes  |  |
 | itemQty | Int? |  yes  |  |
 | invoiceId | String? |  yes  |  |

---


 
 
 #### [ManifestDetailResponse](#ManifestDetailResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [ManifestPage](#ManifestPage)? |  yes  |  |
 | manifestDetails | ArrayList<[ManifestDetail](#ManifestDetail)>? |  yes  |  |
 | additionalShipmentCount | Int? |  yes  |  |
 | items | ArrayList<[ManifestDetailItem](#ManifestDetailItem)>? |  yes  |  |

---


 
 
 #### [QuestionSet](#QuestionSet)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | id | Int? |  yes  |  |
 | displayName | String? |  yes  |  |

---


 
 
 #### [Reason](#Reason)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | questionSet | ArrayList<[QuestionSet](#QuestionSet)>? |  yes  |  |
 | qcType | ArrayList<String>? |  yes  |  |
 | id | Int? |  yes  |  |
 | displayName | String? |  yes  |  |

---


 
 
 #### [PlatformShipmentReasonsResponse](#PlatformShipmentReasonsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | success | Boolean? |  yes  |  |
 | reasons | ArrayList<[Reason](#Reason)>? |  yes  |  |

---


 
 
 #### [BulkActionPayload](#BulkActionPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | url | String |  no  |  |

---


 
 
 #### [BulkActionResponse](#BulkActionResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | Boolean? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [BulkActionDetailsDataField](#BulkActionDetailsDataField)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | failedShipmentsCount | Int? |  yes  |  |
 | companyId | String? |  yes  |  |
 | batchId | String? |  yes  |  |
 | successfulShipmentIds | ArrayList<String>? |  yes  |  |
 | totalShipmentsCount | Int? |  yes  |  |
 | processingShipmentsCount | Int? |  yes  |  |
 | successfulShipmentsCount | Int? |  yes  |  |

---


 
 
 #### [BulkActionDetailsResponse](#BulkActionDetailsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | userId | String? |  yes  |  |
 | uploadedOn | String? |  yes  |  |
 | error | ArrayList<String>? |  yes  |  |
 | uploadedBy | String? |  yes  |  |
 | success | String? |  yes  |  |
 | data | ArrayList<[BulkActionDetailsDataField](#BulkActionDetailsDataField)>? |  yes  |  |
 | status | Boolean? |  yes  |  |
 | failedRecords | ArrayList<String>? |  yes  |  |
 | message | String? |  yes  |  |

---


 
 
 #### [StoreAddress](#StoreAddress)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdAt | String |  no  |  |
 | area | String? |  yes  |  |
 | phone | String |  no  |  |
 | contactPerson | String |  no  |  |
 | latitude | Double |  no  |  |
 | landmark | String? |  yes  |  |
 | address2 | String? |  yes  |  |
 | version | String? |  yes  |  |
 | address1 | String |  no  |  |
 | pincode | Int |  no  |  |
 | addressCategory | String |  no  |  |
 | country | String |  no  |  |
 | city | String |  no  |  |
 | addressType | String |  no  |  |
 | countryCode | String |  no  |  |
 | state | String |  no  |  |
 | longitude | Double |  no  |  |
 | email | String? |  yes  |  |
 | updatedAt | String |  no  |  |

---


 
 
 #### [StoreEinvoice](#StoreEinvoice)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | username | String? |  yes  |  |
 | user | String? |  yes  |  |
 | password | String? |  yes  |  |
 | enabled | Boolean |  no  |  |

---


 
 
 #### [StoreEwaybill](#StoreEwaybill)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enabled | Boolean? |  yes  |  |

---


 
 
 #### [StoreGstCredentials](#StoreGstCredentials)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | eInvoice | [StoreEinvoice](#StoreEinvoice)? |  yes  |  |
 | eWaybill | [StoreEwaybill](#StoreEwaybill)? |  yes  |  |

---


 
 
 #### [Document](#Document)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | verified | Boolean |  no  |  |
 | dsType | String |  no  |  |
 | legalName | String |  no  |  |
 | value | String |  no  |  |
 | url | String? |  yes  |  |

---


 
 
 #### [StoreDocuments](#StoreDocuments)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gst | [Document](#Document)? |  yes  |  |

---


 
 
 #### [EInvoicePortalDetails](#EInvoicePortalDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | password | String? |  yes  |  |
 | username | String? |  yes  |  |
 | user | String? |  yes  |  |

---


 
 
 #### [StoreMeta](#StoreMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | additionalContactDetails | HashMap<String,Any>? |  yes  |  |
 | timing | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | displayName | String |  no  |  |
 | gstNumber | String? |  yes  |  |
 | notificationEmails | ArrayList<String>? |  yes  |  |
 | gstCredentials | [StoreGstCredentials](#StoreGstCredentials) |  no  |  |
 | stage | String |  no  |  |
 | ewaybillPortalDetails | HashMap<String,Any>? |  yes  |  |
 | documents | [StoreDocuments](#StoreDocuments)? |  yes  |  |
 | productReturnConfig | HashMap<String,Any>? |  yes  |  |
 | einvoicePortalDetails | [EInvoicePortalDetails](#EInvoicePortalDetails)? |  yes  |  |

---


 
 
 #### [Store](#Store)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | createdAt | String |  no  |  |
 | fulfillmentChannel | String |  no  |  |
 | alohomoraUserId | Int? |  yes  |  |
 | storeActiveFrom | String? |  yes  |  |
 | sId | String |  no  |  |
 | mallName | String? |  yes  |  |
 | companyId | Int |  no  |  |
 | phone | Int |  no  |  |
 | orderIntegrationId | String? |  yes  |  |
 | loginUsername | String |  no  |  |
 | packagingMaterialCount | Int? |  yes  |  |
 | contactPerson | String |  no  |  |
 | latitude | Double |  no  |  |
 | brandStoreTags | ArrayList<String>? |  yes  |  |
 | isEnabledForRecon | Boolean? |  yes  |  |
 | address2 | String? |  yes  |  |
 | vatNo | String? |  yes  |  |
 | address1 | String |  no  |  |
 | isArchived | Boolean? |  yes  |  |
 | brandId | Any? |  yes  |  |
 | pincode | String |  no  |  |
 | storeAddressJson | [StoreAddress](#StoreAddress)? |  yes  |  |
 | country | String |  no  |  |
 | city | String |  no  |  |
 | locationType | String |  no  |  |
 | state | String |  no  |  |
 | longitude | Double |  no  |  |
 | storeEmail | String |  no  |  |
 | name | String |  no  |  |
 | mallArea | String? |  yes  |  |
 | meta | [StoreMeta](#StoreMeta) |  no  |  |
 | code | String? |  yes  |  |
 | parentStoreId | Int? |  yes  |  |
 | isActive | Boolean? |  yes  |  |
 | updatedAt | String? |  yes  |  |

---


 
 
 #### [AffiliateMeta](#AffiliateMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | loyaltyDiscount | Double? |  yes  |  |
 | orderItemId | String? |  yes  |  |
 | couponCode | String? |  yes  |  |
 | quantity | Int? |  yes  |  |
 | isPriority | Boolean? |  yes  |  |
 | employeeDiscount | Double? |  yes  |  |
 | sizeLevelTotalQty | Int? |  yes  |  |
 | channelShipmentId | String? |  yes  |  |
 | boxType | String? |  yes  |  |
 | channelOrderId | String? |  yes  |  |
 | dueDate | String? |  yes  |  |

---


 
 
 #### [AffiliateBagDetails](#AffiliateBagDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | affiliateBagId | String |  no  |  |
 | loyaltyDiscount | Double? |  yes  |  |
 | affiliateOrderId | String |  no  |  |
 | employeeDiscount | Double? |  yes  |  |
 | affiliateMeta | [AffiliateMeta](#AffiliateMeta) |  no  |  |

---


 
 
 #### [PDFLinks](#PDFLinks)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | label | String? |  yes  |  |
 | labelType | String |  no  |  |
 | invoiceType | String |  no  |  |
 | invoiceA4 | String? |  yes  |  |
 | invoice | String? |  yes  |  |
 | labelA6 | String? |  yes  |  |
 | b2B | String? |  yes  |  |
 | invoicePos | String? |  yes  |  |
 | poInvoice | String? |  yes  |  |
 | labelA4 | String? |  yes  |  |
 | invoiceA6 | String? |  yes  |  |
 | creditNoteUrl | String? |  yes  |  |
 | labelPos | String? |  yes  |  |

---


 
 
 #### [Formatted](#Formatted)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fMax | String? |  yes  |  |
 | fMin | String? |  yes  |  |

---


 
 
 #### [EInvoice](#EInvoice)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | errorMessage | String? |  yes  |  |
 | errorCode | String? |  yes  |  |
 | signedInvoice | String? |  yes  |  |
 | signedQrCode | String? |  yes  |  |
 | acknowledgeDate | String? |  yes  |  |
 | irn | String? |  yes  |  |
 | acknowledgeNo | Int? |  yes  |  |

---


 
 
 #### [EinvoiceInfo](#EinvoiceInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | invoice | [EInvoice](#EInvoice)? |  yes  |  |
 | creditNote | [EInvoice](#EInvoice)? |  yes  |  |

---


 
 
 #### [LockData](#LockData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | lockMessage | String? |  yes  |  |
 | locked | Boolean? |  yes  |  |
 | mto | Boolean? |  yes  |  |

---


 
 
 #### [BuyerDetails](#BuyerDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | city | String |  no  |  |
 | state | String |  no  |  |
 | address | String |  no  |  |
 | name | String |  no  |  |
 | gstin | String |  no  |  |
 | pincode | Int |  no  |  |
 | ajioSiteId | String? |  yes  |  |

---


 
 
 #### [DebugInfo](#DebugInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stormbreakerUuid | String? |  yes  |  |

---


 
 
 #### [ShipmentTimeStamp](#ShipmentTimeStamp)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tMin | String? |  yes  |  |
 | tMax | String? |  yes  |  |

---


 
 
 #### [ShipmentMeta](#ShipmentMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | returnStoreNode | Int? |  yes  |  |
 | dpId | String? |  yes  |  |
 | weight | Int |  no  |  |
 | orderType | String? |  yes  |  |
 | forwardAffiliateShipmentId | String? |  yes  |  |
 | assignDpFromSb | Boolean? |  yes  |  |
 | formatted | [Formatted](#Formatted)? |  yes  |  |
 | sameStoreAvailable | Boolean |  no  |  |
 | external | HashMap<String,Any>? |  yes  |  |
 | autoTriggerDpAssignmentAcf | Boolean |  no  |  |
 | einvoiceInfo | [EinvoiceInfo](#EinvoiceInfo)? |  yes  |  |
 | packagingName | String? |  yes  |  |
 | dueDate | String? |  yes  |  |
 | returnAffiliateOrderId | String? |  yes  |  |
 | shipmentWeight | Double? |  yes  |  |
 | storeInvoiceUpdatedDate | String? |  yes  |  |
 | b2CBuyerDetails | HashMap<String,Any>? |  yes  |  |
 | dpSortKey | String? |  yes  |  |
 | ewaybillInfo | HashMap<String,Any>? |  yes  |  |
 | returnDetails | HashMap<String,Any>? |  yes  |  |
 | dpOptions | HashMap<String,Any>? |  yes  |  |
 | returnAwbNumber | String? |  yes  |  |
 | lockData | [LockData](#LockData)? |  yes  |  |
 | boxType | String? |  yes  |  |
 | awbNumber | String? |  yes  |  |
 | b2BBuyerDetails | [BuyerDetails](#BuyerDetails)? |  yes  |  |
 | dpName | String? |  yes  |  |
 | marketplaceStoreId | String? |  yes  |  |
 | poNumber | String? |  yes  |  |
 | fulfilmentPriorityText | String? |  yes  |  |
 | returnAffiliateShipmentId | String? |  yes  |  |
 | debugInfo | [DebugInfo](#DebugInfo)? |  yes  |  |
 | shipmentVolumetricWeight | Double? |  yes  |  |
 | forwardAffiliateOrderId | String? |  yes  |  |
 | bagWeight | HashMap<String,Any>? |  yes  |  |
 | timestamp | [ShipmentTimeStamp](#ShipmentTimeStamp)? |  yes  |  |

---


 
 
 #### [AffiliateDetails](#AffiliateDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | affiliateBagId | String |  no  |  |
 | affiliateShipmentId | String |  no  |  |
 | pdfLinks | [PDFLinks](#PDFLinks)? |  yes  |  |
 | affiliateOrderId | String |  no  |  |
 | affiliateId | String? |  yes  |  |
 | shipmentMeta | [ShipmentMeta](#ShipmentMeta) |  no  |  |
 | companyAffiliateTag | String? |  yes  |  |
 | affiliateStoreId | String |  no  |  |
 | adId | String? |  yes  |  |
 | affiliateMeta | [AffiliateMeta](#AffiliateMeta) |  no  |  |

---


 
 
 #### [BagGSTDetails](#BagGSTDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | igstTaxPercentage | Double |  no  |  |
 | gstTaxPercentage | Double |  no  |  |
 | hsnCode | String |  no  |  |
 | gstTag | String |  no  |  |
 | gstinCode | String? |  yes  |  |
 | hsnCodeId | String |  no  |  |
 | taxCollectedAtSource | Double |  no  |  |
 | isDefaultHsnCode | Boolean? |  yes  |  |
 | sgstGstFee | String |  no  |  |
 | brandCalculatedAmount | Double |  no  |  |
 | igstGstFee | String |  no  |  |
 | cgstGstFee | String |  no  |  |
 | cgstTaxPercentage | Double |  no  |  |
 | valueOfGood | Double |  no  |  |
 | sgstTaxPercentage | Double |  no  |  |
 | gstFee | Double |  no  |  |

---


 
 
 #### [Attributes](#Attributes)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | essential | String? |  yes  |  |
 | marketerAddress | String? |  yes  |  |
 | brandName | String? |  yes  |  |
 | primaryColor | String? |  yes  |  |
 | primaryMaterial | String? |  yes  |  |
 | name | String? |  yes  |  |
 | marketerName | String? |  yes  |  |
 | gender | ArrayList<String>? |  yes  |  |
 | primaryColorHex | String? |  yes  |  |

---


 
 
 #### [Item](#Item)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | l3CategoryName | String? |  yes  |  |
 | l2Category | ArrayList<String>? |  yes  |  |
 | lastUpdatedAt | String? |  yes  |  |
 | itemId | Int |  no  |  |
 | size | String |  no  |  |
 | gender | String? |  yes  |  |
 | l1CategoryId | Int? |  yes  |  |
 | slugKey | String |  no  |  |
 | departmentId | Int? |  yes  |  |
 | image | ArrayList<String> |  no  |  |
 | brandId | Int |  no  |  |
 | l3Category | Int? |  yes  |  |
 | branchUrl | String? |  yes  |  |
 | canReturn | Boolean? |  yes  |  |
 | webstoreProductUrl | String? |  yes  |  |
 | l2CategoryId | Int? |  yes  |  |
 | name | String |  no  |  |
 | canCancel | Boolean? |  yes  |  |
 | meta | HashMap<String,Any>? |  yes  |  |
 | attributes | [Attributes](#Attributes) |  no  |  |
 | code | String? |  yes  |  |
 | brand | String |  no  |  |
 | l1Category | ArrayList<String>? |  yes  |  |
 | color | String? |  yes  |  |

---


 
 
 #### [BagReturnableCancelableStatus](#BagReturnableCancelableStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | enableTracking | Boolean |  no  |  |
 | isCustomerReturnAllowed | Boolean |  no  |  |
 | canBeCancelled | Boolean |  no  |  |
 | isReturnable | Boolean |  no  |  |
 | isActive | Boolean |  no  |  |

---


 
 
 #### [ArticleDetails](#ArticleDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [ReturnConfig](#ReturnConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | returnable | Boolean? |  yes  |  |
 | unit | String? |  yes  |  |
 | time | Int? |  yes  |  |

---


 
 
 #### [Dimensions](#Dimensions)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | width | Int? |  yes  |  |
 | unit | String? |  yes  |  |
 | height | Int? |  yes  |  |
 | isDefault | Boolean? |  yes  |  |
 | length | Int? |  yes  |  |

---


 
 
 #### [Weight](#Weight)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isDefault | Boolean? |  yes  |  |
 | shipping | Int? |  yes  |  |
 | unit | String? |  yes  |  |

---


 
 
 #### [Article](#Article)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | returnConfig | [ReturnConfig](#ReturnConfig)? |  yes  |  |
 | rawMeta | Any? |  yes  |  |
 | aSet | HashMap<String,Any>? |  yes  |  |
 | isSet | Boolean? |  yes  |  |
 | id | String |  no  |  |
 | childDetails | HashMap<String,Any>? |  yes  |  |
 | dimensions | [Dimensions](#Dimensions)? |  yes  |  |
 | code | String? |  yes  |  |
 | sellerIdentifier | String |  no  |  |
 | uid | String |  no  |  |
 | weight | [Weight](#Weight)? |  yes  |  |
 | espModified | Any? |  yes  |  |
 | size | String |  no  |  |
 | identifiers | [Identifier](#Identifier) |  no  |  |

---


 
 
 #### [Brand](#Brand)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | modifiedOn | Int? |  yes  |  |
 | company | String |  no  |  |
 | createdOn | Int? |  yes  |  |
 | pickupLocation | String? |  yes  |  |
 | brandName | String |  no  |  |
 | startDate | String? |  yes  |  |
 | isVirtualInvoice | Boolean? |  yes  |  |
 | invoicePrefix | String? |  yes  |  |
 | scriptLastRan | String? |  yes  |  |
 | logo | String? |  yes  |  |
 | brandId | Int |  no  |  |
 | creditNoteExpiryDays | Int? |  yes  |  |
 | creditNoteAllowed | Boolean? |  yes  |  |

---


 
 
 #### [B2BPODetails](#B2BPODetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | totalGstPercentage | Double? |  yes  |  |
 | poTaxAmount | Double? |  yes  |  |
 | dockerNumber | String? |  yes  |  |
 | partialCanRet | Boolean? |  yes  |  |
 | itemBasePrice | Double? |  yes  |  |
 | poLineAmount | Double? |  yes  |  |

---


 
 
 #### [BagMeta](#BagMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | b2BPoDetails | [B2BPODetails](#B2BPODetails)? |  yes  |  |

---


 
 
 #### [Dates](#Dates)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | deliveryDate | Any? |  yes  |  |
 | orderCreated | String? |  yes  |  |

---


 
 
 #### [BagDetailsPlatformResponse](#BagDetailsPlatformResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderingStore | [Store](#Store)? |  yes  |  |
 | currentOperationalStatus | [BagStatusHistory](#BagStatusHistory) |  no  |  |
 | displayName | String? |  yes  |  |
 | restoreCoupon | Boolean? |  yes  |  |
 | affiliateBagDetails | [AffiliateBagDetails](#AffiliateBagDetails) |  no  |  |
 | quantity | Double? |  yes  |  |
 | parentPromoBags | HashMap<String,Any>? |  yes  |  |
 | currentStatus | [BagStatusHistory](#BagStatusHistory) |  no  |  |
 | affiliateDetails | [AffiliateDetails](#AffiliateDetails)? |  yes  |  |
 | gstDetails | [BagGSTDetails](#BagGSTDetails) |  no  |  |
 | tags | ArrayList<String>? |  yes  |  |
 | item | [Item](#Item) |  no  |  |
 | bType | String? |  yes  |  |
 | identifier | String? |  yes  |  |
 | orderIntegrationId | String? |  yes  |  |
 | status | [BagReturnableCancelableStatus](#BagReturnableCancelableStatus) |  no  |  |
 | articleDetails | [ArticleDetails](#ArticleDetails)? |  yes  |  |
 | restorePromos | HashMap<String,Any>? |  yes  |  |
 | sellerIdentifier | String? |  yes  |  |
 | bagStatus | ArrayList<[BagStatusHistory](#BagStatusHistory)> |  no  |  |
 | entityType | String? |  yes  |  |
 | qcRequired | Any? |  yes  |  |
 | noOfBagsOrder | Int? |  yes  |  |
 | bagUpdateTime | Double? |  yes  |  |
 | appliedPromos | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | operationalStatus | String? |  yes  |  |
 | originalBagList | ArrayList<Int>? |  yes  |  |
 | journeyType | String |  no  |  |
 | article | [Article](#Article) |  no  |  |
 | prices | [Prices](#Prices) |  no  |  |
 | shipmentId | String? |  yes  |  |
 | bagStatusHistory | [BagStatusHistory](#BagStatusHistory)? |  yes  |  |
 | brand | [Brand](#Brand) |  no  |  |
 | meta | [BagMeta](#BagMeta)? |  yes  |  |
 | financialBreakup | ArrayList<[FinancialBreakup](#FinancialBreakup)> |  no  |  |
 | lineNumber | Int? |  yes  |  |
 | dates | [Dates](#Dates)? |  yes  |  |
 | bId | Int |  no  |  |
 | reasons | ArrayList<HashMap<String,Any>>? |  yes  |  |

---


 
 
 #### [ErrorResponse](#ErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | error | String |  no  |  |
 | message | String |  no  |  |

---


 
 
 #### [Page1](#Page1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | pageType | String |  no  |  |
 | hasNext | Boolean |  no  |  |
 | current | Int |  no  |  |
 | itemTotal | Int |  no  |  |
 | size | Int |  no  |  |

---


 
 
 #### [GetBagsPlatformResponse](#GetBagsPlatformResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | page | [Page1](#Page1) |  no  |  |
 | items | ArrayList<[BagDetailsPlatformResponse](#BagDetailsPlatformResponse)> |  no  |  |

---


 
 
 #### [InvalidateShipmentCachePayload](#InvalidateShipmentCachePayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipmentIds | ArrayList<String> |  no  |  |

---


 
 
 #### [InvalidateShipmentCacheNestedResponse](#InvalidateShipmentCacheNestedResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipmentId | String? |  yes  |  |
 | message | String? |  yes  |  |
 | status | Int? |  yes  |  |
 | error | String? |  yes  |  |

---


 
 
 #### [InvalidateShipmentCacheResponse](#InvalidateShipmentCacheResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | response | ArrayList<[InvalidateShipmentCacheNestedResponse](#InvalidateShipmentCacheNestedResponse)>? |  yes  |  |

---


 
 
 #### [ErrorResponse1](#ErrorResponse1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | errorTrace | String? |  yes  |  |
 | message | String |  no  |  |
 | status | Int |  no  |  |

---


 
 
 #### [StoreReassign](#StoreReassign)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | affiliateId | String? |  yes  |  |
 | itemId | String? |  yes  |  |
 | affiliateOrderId | String? |  yes  |  |
 | fyndOrderId | String? |  yes  |  |
 | affiliateBagId | String? |  yes  |  |
 | bagId | Int? |  yes  |  |
 | setId | String? |  yes  |  |
 | storeId | Int |  no  |  |
 | mongoArticleId | String? |  yes  |  |
 | reasonIds | ArrayList<Int>? |  yes  |  |

---


 
 
 #### [StoreReassignResponse](#StoreReassignResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [Entities](#Entities)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | reasonText | String |  no  |  |
 | affiliateId | String? |  yes  |  |
 | affiliateOrderId | String? |  yes  |  |
 | affiliateBagId | String? |  yes  |  |
 | affiliateShipmentId | String? |  yes  |  |
 | id | String? |  yes  |  |

---


 
 
 #### [UpdateShipmentLockPayload](#UpdateShipmentLockPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | entities | ArrayList<[Entities](#Entities)> |  no  |  |
 | actionType | String |  no  |  |
 | entityType | String |  no  |  |
 | action | String |  no  |  |

---


 
 
 #### [Bags](#Bags)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | affiliateBagId | String? |  yes  |  |
 | affiliateOrderId | String? |  yes  |  |
 | isLocked | Boolean? |  yes  |  |
 | bagId | Int? |  yes  |  |

---


 
 
 #### [OriginalFilter](#OriginalFilter)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | affiliateId | String? |  yes  |  |
 | affiliateShipmentId | String? |  yes  |  |

---


 
 
 #### [CheckResponse](#CheckResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipmentId | String? |  yes  |  |
 | bags | ArrayList<[Bags](#Bags)>? |  yes  |  |
 | affiliateId | String? |  yes  |  |
 | isShipmentLocked | Boolean? |  yes  |  |
 | status | String? |  yes  |  |
 | affiliateShipmentId | String? |  yes  |  |
 | isBagLocked | Boolean? |  yes  |  |
 | lockStatus | Boolean? |  yes  |  |
 | originalFilter | [OriginalFilter](#OriginalFilter)? |  yes  |  |

---


 
 
 #### [UpdateShipmentLockResponse](#UpdateShipmentLockResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | checkResponse | ArrayList<[CheckResponse](#CheckResponse)>? |  yes  |  |
 | message | String? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [AnnouncementResponse](#AnnouncementResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | companyId | Int? |  yes  |  |
 | platformName | String? |  yes  |  |
 | fromDatetime | String? |  yes  |  |
 | logoUrl | String? |  yes  |  |
 | toDatetime | String? |  yes  |  |
 | description | String? |  yes  |  |
 | platformId | String? |  yes  |  |
 | title | String? |  yes  |  |
 | createdAt | String? |  yes  |  |
 | id | Int |  no  |  |

---


 
 
 #### [AnnouncementsResponse](#AnnouncementsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | announcements | ArrayList<[AnnouncementResponse](#AnnouncementResponse)>? |  yes  |  |

---


 
 
 #### [BaseResponse](#BaseResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |
 | success | Boolean |  no  |  |

---


 
 
 #### [Click2CallResponse](#Click2CallResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | status | Boolean |  no  |  |
 | callId | String |  no  |  |

---


 
 
 #### [EntitiesDataUpdates](#EntitiesDataUpdates)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filters | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | data | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [ProductsDataUpdatesFilters](#ProductsDataUpdatesFilters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | identifier | String? |  yes  |  |
 | lineNumber | Int? |  yes  |  |

---


 
 
 #### [ProductsDataUpdates](#ProductsDataUpdates)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filters | ArrayList<[ProductsDataUpdatesFilters](#ProductsDataUpdatesFilters)>? |  yes  |  |
 | data | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [DataUpdates](#DataUpdates)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | entities | ArrayList<[EntitiesDataUpdates](#EntitiesDataUpdates)>? |  yes  |  |
 | products | ArrayList<[ProductsDataUpdates](#ProductsDataUpdates)>? |  yes  |  |

---


 
 
 #### [Products](#Products)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | identifier | String? |  yes  |  |
 | quantity | Int? |  yes  |  |
 | lineNumber | Int? |  yes  |  |

---


 
 
 #### [EntityReasonData](#EntityReasonData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | reasonText | String? |  yes  |  |
 | reasonId | Int? |  yes  |  |

---


 
 
 #### [EntitiesReasons](#EntitiesReasons)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filters | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | data | [EntityReasonData](#EntityReasonData)? |  yes  |  |

---


 
 
 #### [ProductsReasonsFilters](#ProductsReasonsFilters)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | identifier | String? |  yes  |  |
 | quantity | Int? |  yes  |  |
 | lineNumber | Int? |  yes  |  |

---


 
 
 #### [ProductsReasonsData](#ProductsReasonsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | reasonText | String? |  yes  |  |
 | reasonId | Int? |  yes  |  |

---


 
 
 #### [ProductsReasons](#ProductsReasons)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | filters | ArrayList<[ProductsReasonsFilters](#ProductsReasonsFilters)>? |  yes  |  |
 | data | [ProductsReasonsData](#ProductsReasonsData)? |  yes  |  |

---


 
 
 #### [ReasonsData](#ReasonsData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | entities | ArrayList<[EntitiesReasons](#EntitiesReasons)>? |  yes  |  |
 | products | ArrayList<[ProductsReasons](#ProductsReasons)>? |  yes  |  |

---


 
 
 #### [ShipmentsRequest](#ShipmentsRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | identifier | String |  no  |  |
 | dataUpdates | [DataUpdates](#DataUpdates)? |  yes  |  |
 | products | ArrayList<[Products](#Products)>? |  yes  |  |
 | reasons | [ReasonsData](#ReasonsData)? |  yes  |  |

---


 
 
 #### [StatuesRequest](#StatuesRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | excludeBagsNextState | String? |  yes  |  |
 | shipments | ArrayList<[ShipmentsRequest](#ShipmentsRequest)>? |  yes  |  |
 | status | String? |  yes  |  |

---


 
 
 #### [UpdateShipmentStatusRequest](#UpdateShipmentStatusRequest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | statuses | ArrayList<[StatuesRequest](#StatuesRequest)>? |  yes  |  |
 | lockAfterTransition | Boolean? |  yes  |  |
 | forceTransition | Boolean? |  yes  |  |
 | unlockBeforeTransition | Boolean? |  yes  |  |
 | task | Boolean? |  yes  |  |

---


 
 
 #### [ShipmentsResponse](#ShipmentsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stackTrace | String? |  yes  |  |
 | message | String? |  yes  |  |
 | identifier | String? |  yes  |  |
 | status | Int? |  yes  |  |
 | code | String? |  yes  |  |
 | meta | HashMap<String,Any>? |  yes  |  |
 | exception | String? |  yes  |  |
 | finalState | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [StatuesResponse](#StatuesResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipments | ArrayList<[ShipmentsResponse](#ShipmentsResponse)>? |  yes  |  |

---


 
 
 #### [UpdateShipmentStatusResponseBody](#UpdateShipmentStatusResponseBody)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | statuses | ArrayList<[StatuesResponse](#StatuesResponse)>? |  yes  |  |

---


 
 
 #### [AffiliateStoreIdMapping](#AffiliateStoreIdMapping)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | marketplaceStoreId | String |  no  |  |
 | storeId | Int |  no  |  |

---


 
 
 #### [AffiliateInventoryOrderConfig](#AffiliateInventoryOrderConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | forceReassignment | Boolean? |  yes  |  |

---


 
 
 #### [AffiliateInventoryPaymentConfig](#AffiliateInventoryPaymentConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | modeOfPayment | String? |  yes  |  |
 | source | String? |  yes  |  |

---


 
 
 #### [AffiliateInventoryStoreConfig](#AffiliateInventoryStoreConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | store | HashMap<String,Any>? |  yes  |  |

---


 
 
 #### [AffiliateInventoryArticleAssignmentConfig](#AffiliateInventoryArticleAssignmentConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | postOrderReassignment | Boolean? |  yes  |  |

---


 
 
 #### [AffiliateInventoryLogisticsConfig](#AffiliateInventoryLogisticsConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | dpAssignment | Boolean? |  yes  |  |

---


 
 
 #### [AffiliateInventoryConfig](#AffiliateInventoryConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | order | [AffiliateInventoryOrderConfig](#AffiliateInventoryOrderConfig)? |  yes  |  |
 | payment | [AffiliateInventoryPaymentConfig](#AffiliateInventoryPaymentConfig)? |  yes  |  |
 | inventory | [AffiliateInventoryStoreConfig](#AffiliateInventoryStoreConfig)? |  yes  |  |
 | articleAssignment | [AffiliateInventoryArticleAssignmentConfig](#AffiliateInventoryArticleAssignmentConfig)? |  yes  |  |
 | logistics | [AffiliateInventoryLogisticsConfig](#AffiliateInventoryLogisticsConfig)? |  yes  |  |

---


 
 
 #### [AffiliateAppConfigMeta](#AffiliateAppConfigMeta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | name | String |  no  |  |
 | value | String |  no  |  |

---


 
 
 #### [AffiliateAppConfig](#AffiliateAppConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | token | String |  no  |  |
 | updatedAt | String |  no  |  |
 | name | String |  no  |  |
 | owner | String |  no  |  |
 | description | String? |  yes  |  |
 | meta | ArrayList<[AffiliateAppConfigMeta](#AffiliateAppConfigMeta)>? |  yes  |  |
 | secret | String |  no  |  |
 | createdAt | String |  no  |  |
 | id | String |  no  |  |

---


 
 
 #### [AffiliateConfig](#AffiliateConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | inventory | [AffiliateInventoryConfig](#AffiliateInventoryConfig)? |  yes  |  |
 | app | [AffiliateAppConfig](#AffiliateAppConfig)? |  yes  |  |

---


 
 
 #### [Affiliate](#Affiliate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | token | String |  no  |  |
 | config | [AffiliateConfig](#AffiliateConfig)? |  yes  |  |
 | id | String |  no  |  |

---


 
 
 #### [OrderConfig](#OrderConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | bagEndState | String? |  yes  |  |
 | articleLookup | String? |  yes  |  |
 | createUser | Boolean? |  yes  |  |
 | storeLookup | String? |  yes  |  |
 | affiliateStoreIdMapping | ArrayList<[AffiliateStoreIdMapping](#AffiliateStoreIdMapping)> |  no  |  |
 | affiliate | [Affiliate](#Affiliate) |  no  |  |

---


 
 
 #### [OrderPriority](#OrderPriority)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | affiliatePriorityCode | String? |  yes  |  |
 | fulfilmentPriority | Int? |  yes  |  |
 | fulfilmentPriorityText | String? |  yes  |  |

---


 
 
 #### [MarketPlacePdf](#MarketPlacePdf)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | invoice | String? |  yes  |  |
 | label | String? |  yes  |  |

---


 
 
 #### [AffiliateBag](#AffiliateBag)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | companyId | Int |  no  |  |
 | itemSize | String |  no  |  |
 | affiliateMeta | HashMap<String,Any> |  no  |  |
 | modifiedOn | String |  no  |  |
 | avlQty | Int |  no  |  |
 | pdfLinks | [MarketPlacePdf](#MarketPlacePdf)? |  yes  |  |
 | sku | String |  no  |  |
 | id | String |  no  |  |
 | quantity | Int |  no  |  |
 | discount | Double |  no  |  |
 | sellerIdentifier | String |  no  |  |
 | priceEffective | Double |  no  |  |
 | storeId | Int |  no  |  |
 | amountPaid | Double |  no  |  |
 | hsnCodeId | String |  no  |  |
 | identifier | HashMap<String,Any> |  no  |  |
 | itemId | Int |  no  |  |
 | deliveryCharge | Double |  no  |  |
 | affiliateStoreId | String |  no  |  |
 | priceMarked | Double |  no  |  |
 | transferPrice | Int |  no  |  |
 | unitPrice | Double |  no  |  |
 | fyndStoreId | String |  no  |  |

---


 
 
 #### [OrderUser](#OrderUser)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | phone | Int |  no  |  |
 | country | String |  no  |  |
 | email | String |  no  |  |
 | address2 | String? |  yes  |  |
 | firstName | String |  no  |  |
 | lastName | String |  no  |  |
 | pincode | String |  no  |  |
 | state | String |  no  |  |
 | city | String |  no  |  |
 | mobile | Int |  no  |  |
 | address1 | String? |  yes  |  |

---


 
 
 #### [UserData](#UserData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | billingUser | [OrderUser](#OrderUser)? |  yes  |  |
 | shippingUser | [OrderUser](#OrderUser)? |  yes  |  |

---


 
 
 #### [ArticleDetails1](#ArticleDetails1)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | dimension | HashMap<String,Any> |  no  |  |
 | brandId | Int |  no  |  |
 | weight | HashMap<String,Any> |  no  |  |
 | attributes | HashMap<String,Any> |  no  |  |
 | id | String |  no  |  |
 | quantity | Int |  no  |  |
 | category | HashMap<String,Any> |  no  |  |

---


 
 
 #### [ShipmentDetails](#ShipmentDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fulfillmentId | Int |  no  |  |
 | meta | HashMap<String,Any>? |  yes  |  |
 | shipments | Int |  no  |  |
 | affiliateShipmentId | String |  no  |  |
 | boxType | String? |  yes  |  |
 | articles | ArrayList<[ArticleDetails1](#ArticleDetails1)> |  no  |  |
 | dpId | Int? |  yes  |  |

---


 
 
 #### [LocationDetails](#LocationDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fulfillmentType | String |  no  |  |
 | fulfillmentId | Int |  no  |  |
 | articles | ArrayList<[ArticleDetails1](#ArticleDetails1)> |  no  |  |

---


 
 
 #### [ShipmentConfig](#ShipmentConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipment | ArrayList<[ShipmentDetails](#ShipmentDetails)> |  no  |  |
 | identifier | String |  no  |  |
 | source | String |  no  |  |
 | locationDetails | [LocationDetails](#LocationDetails)? |  yes  |  |
 | toPincode | String |  no  |  |
 | paymentMode | String |  no  |  |
 | journey | String |  no  |  |
 | action | String |  no  |  |

---


 
 
 #### [ShipmentData](#ShipmentData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipmentData | [ShipmentConfig](#ShipmentConfig) |  no  |  |

---


 
 
 #### [OrderInfo](#OrderInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | discount | Double |  no  |  |
 | deliveryCharges | Double |  no  |  |
 | orderPriority | [OrderPriority](#OrderPriority)? |  yes  |  |
 | bags | ArrayList<[AffiliateBag](#AffiliateBag)> |  no  |  |
 | user | [UserData](#UserData) |  no  |  |
 | payment | HashMap<String,Any>? |  yes  |  |
 | affiliateOrderId | String? |  yes  |  |
 | orderValue | Double |  no  |  |
 | coupon | String? |  yes  |  |
 | paymentMode | String |  no  |  |
 | codCharges | Double |  no  |  |
 | shippingAddress | [OrderUser](#OrderUser) |  no  |  |
 | items | HashMap<String,Any> |  no  |  |
 | shipment | [ShipmentData](#ShipmentData)? |  yes  |  |
 | billingAddress | [OrderUser](#OrderUser) |  no  |  |

---


 
 
 #### [CreateOrderPayload](#CreateOrderPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | affiliateId | String |  no  |  |
 | orderConfig | [OrderConfig](#OrderConfig) |  no  |  |
 | orderInfo | [OrderInfo](#OrderInfo) |  no  |  |

---


 
 
 #### [CreateOrderResponse](#CreateOrderResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fyndOrderId | String |  no  |  |

---


 
 
 #### [DispatchManifest](#DispatchManifest)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | manifestId | String |  no  |  |

---


 
 
 #### [SuccessResponse](#SuccessResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [ActionInfo](#ActionInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | displayText | String |  no  |  |
 | slug | String |  no  |  |
 | description | String |  no  |  |
 | id | Int |  no  |  |

---


 
 
 #### [GetActionsResponse](#GetActionsResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | permissions | [ActionInfo](#ActionInfo) |  no  |  |

---


 
 
 #### [HistoryDict](#HistoryDict)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String |  no  |  |
 | l3Detail | String? |  yes  |  |
 | user | String |  no  |  |
 | ticketUrl | String? |  yes  |  |
 | l2Detail | String? |  yes  |  |
 | type | String |  no  |  |
 | l1Detail | String? |  yes  |  |
 | ticketId | String? |  yes  |  |
 | bagId | Int? |  yes  |  |
 | createdat | String |  no  |  |

---


 
 
 #### [ShipmentHistoryResponse](#ShipmentHistoryResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | activityHistory | ArrayList<[HistoryDict](#HistoryDict)>? |  yes  |  |

---


 
 
 #### [ErrorDetail](#ErrorDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | String? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [SmsDataPayload](#SmsDataPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | countryCode | String |  no  |  |
 | shipmentId | Int |  no  |  |
 | message | String |  no  |  |
 | amountPaid | Int |  no  |  |
 | phoneNumber | Int |  no  |  |
 | brandName | String |  no  |  |
 | orderId | String |  no  |  |
 | paymentMode | String |  no  |  |
 | customerName | String |  no  |  |

---


 
 
 #### [SendSmsPayload](#SendSmsPayload)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | slug | String |  no  |  |
 | data | [SmsDataPayload](#SmsDataPayload)? |  yes  |  |
 | bagId | Int |  no  |  |

---


 
 
 #### [Meta](#Meta)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stateManagerUsed | String? |  yes  |  |
 | kafkaEmissionStatus | Int? |  yes  |  |

---


 
 
 #### [ShipmentDetail](#ShipmentDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipmentId | String? |  yes  |  |
 | bagList | ArrayList<Int>? |  yes  |  |
 | remarks | String? |  yes  |  |
 | status | String? |  yes  |  |
 | meta | [Meta](#Meta) |  no  |  |
 | id | Int |  no  |  |

---


 
 
 #### [OrderDetails](#OrderDetails)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fyndOrderId | String? |  yes  |  |
 | createdAt | String? |  yes  |  |

---


 
 
 #### [OrderStatusData](#OrderStatusData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | errors | ArrayList<String>? |  yes  |  |
 | shipmentDetails | ArrayList<[ShipmentDetail](#ShipmentDetail)>? |  yes  |  |
 | orderDetails | [OrderDetails](#OrderDetails) |  no  |  |

---


 
 
 #### [OrderStatusResult](#OrderStatusResult)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | result | ArrayList<[OrderStatusData](#OrderStatusData)>? |  yes  |  |
 | success | String |  no  |  |

---


 
 
 #### [ManualAssignDPToShipment](#ManualAssignDPToShipment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shipmentIds | ArrayList<String>? |  yes  |  |
 | dpId | Int |  no  |  |
 | qcRequired | String |  no  |  |
 | orderType | String |  no  |  |

---


 
 
 #### [ManualAssignDPToShipmentResponse](#ManualAssignDPToShipmentResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | errors | ArrayList<String>? |  yes  |  |
 | success | String |  no  |  |

---


 
 
 #### [PaymentMethod](#PaymentMethod)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | transactionData | HashMap<String,Any>? |  yes  |  |
 | name | String |  no  |  |
 | meta | HashMap<String,Any>? |  yes  |  |
 | refundBy | String |  no  |  |
 | mode | String |  no  |  |
 | collectBy | String |  no  |  |
 | amount | Double |  no  |  |

---


 
 
 #### [PaymentInfo](#PaymentInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | primaryMode | String |  no  |  |
 | paymentMethods | ArrayList<[PaymentMethod](#PaymentMethod)>? |  yes  |  |

---


 
 
 #### [ShippingInfo](#ShippingInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | primaryMobileNumber | String |  no  |  |
 | shippingType | String? |  yes  |  |
 | landmark | String? |  yes  |  |
 | floorNo | String? |  yes  |  |
 | firstName | String |  no  |  |
 | lastName | String? |  yes  |  |
 | pincode | String |  no  |  |
 | address2 | String? |  yes  |  |
 | state | String |  no  |  |
 | addressType | String? |  yes  |  |
 | alternateMobileNumber | String? |  yes  |  |
 | address1 | String |  no  |  |
 | alternateEmail | String? |  yes  |  |
 | primaryEmail | String |  no  |  |
 | gender | String? |  yes  |  |
 | houseNo | String? |  yes  |  |
 | geoLocation | HashMap<String,Any>? |  yes  |  |
 | externalCustomerCode | String? |  yes  |  |
 | title | String? |  yes  |  |
 | middleName | String? |  yes  |  |
 | stateCode | String |  no  |  |
 | countryCode | String |  no  |  |
 | country | String |  no  |  |
 | customerCode | String? |  yes  |  |
 | slot | ArrayList<HashMap<String,Any>>? |  yes  |  |
 | city | String |  no  |  |

---


 
 
 #### [TaxInfo](#TaxInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | gstin | String? |  yes  |  |
 | b2BGstinNumber | String? |  yes  |  |

---


 
 
 #### [BillingInfo](#BillingInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | primaryMobileNumber | String |  no  |  |
 | floorNo | String |  no  |  |
 | firstName | String |  no  |  |
 | lastName | String? |  yes  |  |
 | address2 | String? |  yes  |  |
 | pincode | String |  no  |  |
 | state | String |  no  |  |
 | alternateMobileNumber | String? |  yes  |  |
 | address1 | String |  no  |  |
 | alternateEmail | String? |  yes  |  |
 | primaryEmail | String |  no  |  |
 | gender | String? |  yes  |  |
 | houseNo | String |  no  |  |
 | externalCustomerCode | String? |  yes  |  |
 | title | String? |  yes  |  |
 | middleName | String? |  yes  |  |
 | stateCode | String |  no  |  |
 | countryCode | String |  no  |  |
 | country | String |  no  |  |
 | customerCode | String? |  yes  |  |
 | city | String |  no  |  |

---


 
 
 #### [ProcessingDates](#ProcessingDates)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | dispatchAfterDate | String? |  yes  |  |
 | packByDate | String? |  yes  |  |
 | dispatchByDate | String? |  yes  |  |
 | dpPickupSlot | HashMap<String,Any>? |  yes  |  |
 | customerPickupSlot | HashMap<String,Any>? |  yes  |  |
 | confirmByDate | String? |  yes  |  |

---


 
 
 #### [Tax](#Tax)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | breakup | ArrayList<HashMap<String,Any>> |  no  |  |
 | taxExempt | Boolean |  no  |  |
 | name | String |  no  |  |
 | amount | HashMap<String,Any> |  no  |  |

---


 
 
 #### [Charge](#Charge)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | tax | [Tax](#Tax) |  no  |  |
 | name | String |  no  |  |
 | code | String? |  yes  |  |
 | type | String |  no  |  |
 | amount | HashMap<String,Any> |  no  |  |

---


 
 
 #### [LineItem](#LineItem)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | externalLineId | String? |  yes  |  |
 | customMessasge | String? |  yes  |  |
 | meta | HashMap<String,Any>? |  yes  |  |
 | sellerIdentifier | String |  no  |  |
 | charges | ArrayList<[Charge](#Charge)> |  no  |  |
 | quantity | Int? |  yes  |  |

---


 
 
 #### [Shipment](#Shipment)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | processingDates | [ProcessingDates](#ProcessingDates)? |  yes  |  |
 | priority | Int? |  yes  |  |
 | lineItems | ArrayList<[LineItem](#LineItem)> |  no  |  |
 | meta | HashMap<String,Any>? |  yes  |  |
 | externalShipmentId | Double? |  yes  |  |
 | locationId | Int |  no  |  |

---


 
 
 #### [CreateOrderAPI](#CreateOrderAPI)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | applicationId | String? |  yes  |  |
 | paymentInfo | [PaymentInfo](#PaymentInfo) |  no  |  |
 | shippingInfo | [ShippingInfo](#ShippingInfo) |  no  |  |
 | taxInfo | [TaxInfo](#TaxInfo)? |  yes  |  |
 | currencyInfo | HashMap<String,Any> |  no  |  |
 | meta | HashMap<String,Any>? |  yes  |  |
 | billingInfo | [BillingInfo](#BillingInfo) |  no  |  |
 | externalCreationDate | String? |  yes  |  |
 | shipments | ArrayList<[Shipment](#Shipment)> |  no  |  |
 | charges | ArrayList<[Charge](#Charge)> |  no  |  |
 | externalOrderId | String? |  yes  |  |

---


 
 
 #### [CreateOrderErrorReponse](#CreateOrderErrorReponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | stackTrace | String? |  yes  |  |
 | message | String |  no  |  |
 | status | Int |  no  |  |
 | code | String? |  yes  |  |
 | info | Any? |  yes  |  |
 | meta | String? |  yes  |  |
 | exception | String? |  yes  |  |
 | requestId | String? |  yes  |  |

---


 
 
 #### [PaymentMethods](#PaymentMethods)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | refundBy | String? |  yes  |  |
 | mode | String? |  yes  |  |
 | collectBy | String? |  yes  |  |

---


 
 
 #### [CreateChannelPaymentInfo](#CreateChannelPaymentInfo)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | modeOfPayment | String? |  yes  |  |
 | source | String? |  yes  |  |
 | paymentMethods | ArrayList<[PaymentMethods](#PaymentMethods)>? |  yes  |  |

---


 
 
 #### [DpConfiguration](#DpConfiguration)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | shippingBy | String? |  yes  |  |

---


 
 
 #### [CreateChannelConfig](#CreateChannelConfig)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | paymentInfo | [CreateChannelPaymentInfo](#CreateChannelPaymentInfo)? |  yes  |  |
 | lockStates | ArrayList<String>? |  yes  |  |
 | logoUrl | HashMap<String,Any>? |  yes  |  |
 | locationReassignment | Boolean? |  yes  |  |
 | dpConfiguration | [DpConfiguration](#DpConfiguration)? |  yes  |  |
 | shipmentAssignment | String? |  yes  |  |

---


 
 
 #### [CreateChannelConfigData](#CreateChannelConfigData)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | configData | [CreateChannelConfig](#CreateChannelConfig)? |  yes  |  |

---


 
 
 #### [CreateChannelConifgErrorResponse](#CreateChannelConifgErrorResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | error | String? |  yes  |  |

---


 
 
 #### [CreateChannelConfigResponse](#CreateChannelConfigResponse)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | isInserted | Boolean? |  yes  |  |
 | acknowledged | Boolean? |  yes  |  |
 | isUpserted | Boolean? |  yes  |  |

---


 
 
 #### [UploadConsent](#UploadConsent)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | manifestId | String |  no  |  |
 | consentUrl | String |  no  |  |

---


 
 
 #### [PlatformOrderUpdate](#PlatformOrderUpdate)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | orderId | String |  no  |  |

---


 
 
 #### [ResponseDetail](#ResponseDetail)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | message | ArrayList<String>? |  yes  |  |
 | success | Boolean? |  yes  |  |

---


 
 
 #### [FyndOrderIdList](#FyndOrderIdList)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | fyndOrderId | ArrayList<String>? |  yes  |  |

---


 
 
 #### [OrderStatus](#OrderStatus)

 | Properties | Type | Nullable | Description |
 | ---------- | ---- | -------- | ----------- |
 | endDate | String |  no  |  |
 | orderDetails | ArrayList<[FyndOrderIdList](#FyndOrderIdList)>? |  yes  |  |
 | mobile | Int |  no  |  |
 | startDate | String |  no  |  |

---



