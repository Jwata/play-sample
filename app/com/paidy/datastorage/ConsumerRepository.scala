package com.paidy.datastorage

import com.paidy.domain.Consumer

import scala.concurrent.Future

trait ConsumerRepository {

  def byId(entityId: String): Future[Option[Consumer]]

  def list(offset: Int = 0, limit: Int = 100, status: Option[Consumer.Status] = None): Future[List[Consumer]]

  def count: Future[Long]

  def disableById(entityId: String): Future[Int]

}
