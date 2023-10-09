import pytest
from list_comparator import ListComparator


def test_calculate_average():
    """
    Тестирование метода calculate_average.
    """
    comparator = ListComparator([1, 2, 3], [4, 5, 6])
    assert comparator.calculate_average(comparator.list1) == 2
    assert comparator.calculate_average(comparator.list2) == 5

def test_compare_averages():
    """
    Тестирование метода compare_averages.
    """
    comparator = ListComparator([1, 2, 3], [4, 5, 6])
    assert comparator.compare_averages() == "Второй список имеет большее среднее значение"

    comparator = ListComparator([4, 5, 6], [1, 2, 3])
    assert comparator.compare_averages() == "Первый список имеет большее среднее значение"

    comparator = ListComparator([1, 2, 3], [1, 2, 3])
    assert comparator.compare_averages() == "Средние значения равны"

def test_calculate_average_with_empty_list():
    """
    Тестирование метода calculate_average с пустым списком.
    """
    comparator = ListComparator([], [4, 5, 6])
    assert comparator.calculate_average(comparator.list1) == 0

def test_compare_averages_with_empty_list():
    """
    Тестирование метода compare_averages с пустым списком.
    """
    comparator = ListComparator([], [4, 5, 6])
    assert comparator.compare_averages() == "Второй список имеет большее среднее значение"

def test_calculate_average_with_negative_numbers():
    """
    Тестирование метода calculate_average со списком отрицательных чисел.
    """
    comparator = ListComparator([-1, -2, -3], [4, 5, 6])
    assert comparator.calculate_average(comparator.list1) == -2

def test_compare_averages_with_negative_numbers():
    """
    Тестирование метода compare_averages со списком отрицательных чисел.
    """
    comparator = ListComparator([-1, -2, -3], [4, 5, 6])
    assert comparator.compare_averages() == "Второй список имеет большее среднее значение"
