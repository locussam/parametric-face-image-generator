/*
 * Copyright University of Basel, Graphics and Vision Research Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package faces.apps

object ListApplications extends App {
  println(
    """|Parametric Face Image Generator (PFIG)
       |© University of Basel
       |
       |You just started the PFIG without specifying the exact application.
       |This is no longer allowed. Please choose your application explicitly.
       |You can do that by adapting one of the following commands:
       |
       |  java -Xmx2g -cp generator.jar faces.apps.ControlledFaces <OPTIONS>
       |  java -Xmx2g -cp generator.jar faces.apps.RandomFaces <OPTIONS>
       |
       |Leaving applications overview.
       |""".stripMargin)
}
