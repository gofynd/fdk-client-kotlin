package com.sdk.application

import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.*

interface CatalogDataManager : CatalogApiHelperFace

interface CartDataManager : CartApiHelperFace

interface LeadDataManager : LeadApiHelperFace

interface PaymentDataManager : PaymentApiHelperFace

interface PosCartDataManager : PosCartApiHelperFace

