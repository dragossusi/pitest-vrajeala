package test

import org.junit.Assert.assertTrue
import org.junit.Test

/**
 * pitest-vrajeala
 *
 * @author dragos
 * @since 11/02/2021
 *
 * Copyright (C) 2020  Rachieru Dragos-Mihai
 *
 * pitest-vrajeala is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 2 of the License, or
 * (at your option) any later version.
 *
 * pitest-vrajeala is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with pitest-vrajeala.  If not, see [License](http://www.gnu.org/licenses/) .
 *
 */
class PalindromTest {

    @Test
    fun whenPalindrom_thenAccept() {
        val palindromeTester = Palindrom()
        assertTrue(palindromeTester.isPalindrome("noon"))
    }

}