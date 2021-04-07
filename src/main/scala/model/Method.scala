/*
 *
 *  Copyright 2017-2019 John A. De Goes and the ZIO Contributors
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package zhttp

sealed case class Method(val name: String) {
  override def toString: String = name
}

object Method {

  def apply(name: String) = new Method(name)

  val GET     = Method("GET")
  val HEAD    = Method("HEAD")
  val POST    = Method("POST")
  val PUT     = Method("PUT")
  val DELETE  = Method("DELETE")
  val CONNECT = Method("CONNECT")
  val OPTIONS = Method("OPTIONS")
  val TRACE   = Method("TRACE")
  val PATCH   = Method("PATCH")

}
